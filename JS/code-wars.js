/* Avg score on a test of a students class. The objective is to know if yourPoints is better than the avg score on the test. 
    Return true if the score is better than avg.
*/
function betterThanAverage(classPoints, yourPoints) {
    const length = classPoints.length;
    let sum = yourPoints;
    for(let i = 0; i < length; i++) {
        sum += classPoints[i];
    }
    const avg = sum/(length+1);
    if(avg < yourPoints) 
        return true;
    else
        return false;
}

/*
    Write function bmi that calculates body mass index (bmi = weight / height2).

        if bmi <= 18.5 return "Underweight"

        if bmi <= 25.0 return "Normal"

        if bmi <= 30.0 return "Overweight"

        if bmi > 30 return "Obese"
*/

function bmi(weight, height) {
    const bmi_value = weight / (height ** 2);
    
    if(bmi_value <= 18.5)
        return "Underweight";
    else if (bmi_value <= 25.0)
        return "Normal";
    else if (bmi_value <= 30.0)
        return "Overweight";
    else
        return "Obese";
}

/*
    Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

        invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
        invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
        invert([]) == []
    
    You can assume that all values are integers. Do not mutate the input array/list
*/


function invert(array) {
    for(let i = 0; i < array.length; i++){
        array[i] = array[i] * (-1);
    }
    return array;
}

//Other soluitons
// nested function

function inver_v2(array) {
    const invert = array => array.map(num => -num);
}
// array map
function invert_v3(array) {
    return array.map( x => x === 0 ? x : -x);
}

/*
    Your task is to find the first element of an array that is not consecutive.

    By not consecutive we mean not exactly 1 larger than the previous element of the array.
        E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

    If the whole array is consecutive then return null.
    The array will always have at least 2 elements and all elements will be numbers. 
    The numbers will also all be unique and in ascending order. 
    The numbers could be positive or negative and the first non-consecutive could be either too!

*/

function firstNonConsecutive (arr) {
    for(let i = 1, target = arr[0]; i < arr.length ; i++){
        if(target + 1 !== arr[i]){
            return arr[i];
        }
        target = arr[i];
    }
    return null;
}

/**
 * Create a function finalGrade, which calculates the final grade of a student depending on two parameters: a grade for the exam and a number of completed projects.

This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);

This function should return a number (final grade). There are four types of final grades:

100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
0, in other cases
*/

function finalGrade (exam, projects) {
    return (exam > 90 || projects > 10) ? 100 : 
           (exam > 75 && projects >= 5) ? 90 :
           (exam > 50 && projects >= 2) ? 75 : 0;
}

// Arrow function 

const finalGrade = (exam, projects) => {
    return (
      exam > 90 || projects > 10 ? 100 :
      exam > 75 && projects >= 5 ? 90 :
      exam > 50 && projects >= 2 ? 75 : 0
    )
}

/**
 * Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.
*/

function sumMix(x){
    let sum = 0

    for(let i = 0; i < x.length ; i++){
        if(typeof x[i] === 'string')
            sum += parseInt(x[i])
        else sum += x[i]
    }

    return sum

}

// Other solutions
function sumMix(x){
    return x.map(a => +a).reduce((a, b) => a + b);
}

const sumMix = x => x.reduce((pre, val) => pre + +val, 0);

/**
 * Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
*/

const grow = x => x.reduce((pre, val) => pre * val,0);

// Other solution

const grow_v2 = x => {
    let res = 1;
    for (let i = 0; i < x.length; i++) {
      res *= x[i];
    }
    return res;
};

/**
 * Create a function that takes 2 integers in form of a string as an input, and outputs the sum (also as a string):

Example: (Input1, Input2 -->Output)

"4",  "5" --> "9"
"34", "5" --> "39"
"", "" --> "0"
"2", "" --> "2"
"-5", "3" --> "-2"
Notes:

If either input is an empty string, consider it as zero.

Inputs and the expected output will never exceed the signed 32-bit integer limit (2^31 - 1)
*/

const sumStr =(a,b) => {
    return (a === "" && b === "") ? '0' :
           (b === "") ? (parseInt(a)).toString() :
           (a === "") ? (parseInt(b)).toString() : (parseInt(a) + parseInt(b)).toString();
}

//Other solutions

function sumStr(a,b) {
    return String(Number(a)+Number(b));
}


function sumStr(a,b) {
    /**
     * (+a + +b):

            The + symbol before each variable a and b is used to explicitly convert the string values to numbers. 
            This process is known as type coercion or type casting.
            By using +a, you're converting the a string to a numeric value.
            Similarly, +b converts the b string to a numeric value.
            Then, it adds these two numeric values together.
            + '':

            After performing the addition, the result is implicitly converted back to a string by adding an empty string ('') to it. 
            This is done because the function is expected to return a string.
            return statement:

            The result of the addition, which is now a string, is returned from the function.
     */
    return (+a+ +b)+''  
}

/**
 * You ask a small girl,"How old are you?" She always says, "x years old", where x is a random number between 0 and 9.

Write a program that returns the girl's age (0-9) as an integer.

Assume the test input string is always a valid string. For example, the test input may be "1 year old" or "5 years old". 
The first character in the string is always a number.
*/

function getAge(inputString){
    return parseInt(inputString[1]);
}

/**
 *Terminal game move function
In this game, the hero moves from left to right. 
The player rolls the dice and moves the number of spaces indicated by the dice two times.

Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.

Example:
move(3, 6) should equal 15 
*/

function move (position, roll) {
    return position + (roll * 2)
}

/**
 * After a hard quarter in the office you decide to get some rest on a vacation. 
 * So you will book a flight for you and your girlfriend and try to leave all the mess behind you.

You will need a rental car in order for you to get around in your vacation. 
The manager of the car rental makes you some good offers.

Every day you rent the car costs $40. 
If you rent the car for 7 or more days, you get $50 off your total. 
Alternatively, if you rent the car for 3 or more days, you get $20 off your total.

Write a code that gives out the total amount for different days(d).
*/

function rentalCarCost(d) {
    return (d <= 0) ? 0 :
           (d < 3) ? (40 * d) :
           (d >= 3 && d < 7) ? (40 * d) - 20 : (40 * d) - 50
}

/**
 * Implement a function that accepts 3 integer values a, b, c. 
 * The function should return true if a triangle can be built with the sides of given length and false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).
*/

const triangle = (a,b,c) => {
    return (a+b>c && b + c > a && a + c > b) ? true : false
}

/**
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
*/

const reversed = str => {
    let strings = str.split(' ')
    let length = strings.length

    if(length === 0)
        return str
    else if (length === 1) 
      return str.split('').reverse().join('')    
    let res = ''
    for(let i = 0; i < length ; i++){
        let word = strings[i].split('').reverse().join('')
        if(i === 0)
            res = word + ' '
        else if (i === length - 1)
            res = res + word
        else res = res + word + ' '
    }   
    return res
}