/*
You were camping with your friends far away from home, but when it's time to go back, 
you realize that your fuel is running out and the nearest pump is 50 miles away! 
You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.

Considering these factors, write a function that tells you if it is possible to get to the pump or not.

Function should return true if it is possible and false if not.

//table name zerofuel, columns: mpg, distance_to_pump, fuel_left
*/

SELECT distance_to_pump, mpg, fuel_left, distance_to_pump <= mpg * fuel_left AS res
FROM zerofuel;
--OU
SELECT distance_to_pump, mpg, fuel_left, 
  CASE
    WHEN mpg * fuel_left < distance_to_pump THEN False
    ELSE True
  END
  AS res
FROM zerofuel;

/*
    In your application, there is a section for adults only. 
    You need to get a list of names and ages of users from the users table, who are 18 years old or older.

users table schema

name
age
NOTE: Your solution should use pure SQL. Ruby is used within the test cases just to validate your answer.

*/

SELECT name,age 
FROM users
  WHERE users.age >= 18;


/*
    to hexYou have access to a table of monsters as follows:

    monsters table schema
    id
    name
    legs
    arms
    characteristics
    Your task is to turn the numeric columns (arms, legs) into equivalent hexadecimal values.

    output table schema
    legs
    arms

*/

SELECT to_hex(legs) as legs,
       to_hex(arms) as arms
FROM monsters;

/* Given the following table 'decimals':

** decimals table schema **

id
number1
number2
Return a table with one column (mod) which is the output of number1 modulus number2.

*/

SELECT mod(number1, number2) FROM decimals;

/*

The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.

Task
Given a year, return the century it is in.

Examples
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20
In SQL, you will be given a table years with a column yr for the year. Return a table with a column century.

*/

SELECT yr,
     CEIL(yr/100) as century
From years;

