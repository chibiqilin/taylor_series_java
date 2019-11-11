# TrigLib Ver. 4.0
This repository stores the submission material for an academic assignment. The purpose of the assignment is to create a Java Library implementing standard trigonometric functions in order to test using JUnit Testing.

----

## Assignment Details
Authors: <br/>
![Repo_List](profile/56411355.jpg)
Andrew Vu (6044937)(github Id: chibiqilin)
![Repo_List](profile/1269208.png)
GeZhang Zhu (5921648)(github Id: Sailosha) 

Institution: Brock University

Course: COSC 4F00 Fall 2019 Assignment #2

Professor: D. Bockus

Due Date: Thursday, November 14th, 2019 4:00pm
Late Date: Monday, November 18th, 2019 4:00pm

----

## Library Details
The purpose of this repository is to create a Java library implementing standard six trigonometric functions:
1. Sine
2. Cosine
3. Tangent
4. Cosecant
5. Secant
6. Cotangent

Implementation of these trigonometric functions will be done using Taylor Series expansion.

----

## Library Methods for Marker
All the trigonometric functions input are degree. 
degreeToRadian(double input)
radianToDegree(double input)
sin(double degree)
cos(double degree)
tan(double degree)
sec(double degree)
csc(double degree)
cot(double degree)


----

## How do I use it?

1. Import the library.
2. Perform tests to validate output.

----

## JUnit Testing

JUnit testing will be used to ensure that functions are fully functional in all four quadrants. An exception must be thrown for invalid usage. For example, attempting to perform Tan(90) should throw an error of NaN as the output value is undefined.

A test suite will be integral to this assignment as it will help perform tests on all functions for extreme cases where errors can be expected.

----

## JUnit Test Output
### Sin Test
![sin](https://raw.githubusercontent.com/chibiqilin/taylor_series_java/master/output%20screenshot/v4/2019-11-09_21-48-53.png?token=ANOMJW6MCMU4MO5VQWURAMC52C3DG)
### Cos Test
![cos](https://raw.githubusercontent.com/chibiqilin/taylor_series_java/master/output%20screenshot/v4/2019-11-09_21-48-00.png?token=ANOMJW2A4D5OGSLNHJSMI4C52C2Y4)
### Tan Test
![tan](https://raw.githubusercontent.com/chibiqilin/taylor_series_java/master/output%20screenshot/v4/2019-11-09_21-48-58.png?token=ANOMJW3FQBAJTOZNWTGX2XS52C3FK)
### Sec Test
![sec](https://raw.githubusercontent.com/chibiqilin/taylor_series_java/master/output%20screenshot/v4/2019-11-09_21-48-49.png?token=ANOMJW2H4JFZ4SCBMRKEN6K52C3G4)
### Csc Test
![csc](https://raw.githubusercontent.com/chibiqilin/taylor_series_java/master/output%20screenshot/v4/2019-11-09_21-48-13.png?token=ANOMJWYW3Y57FXHZV2CNU4C52C3H4)
### Cot Test
![cot](https://raw.githubusercontent.com/chibiqilin/taylor_series_java/master/output%20screenshot/v4/2019-11-09_21-48-04.png?token=ANOMJW5KXHTHDLPPO2NTSZ252C3JC)
