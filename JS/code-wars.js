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



 

