# Lab Assignment 5
## The Mixed Number Class

### Table of Contents 

[Problem Description](#problem-description)

[Requirements](#requirements)

[Design Specifications](#design-specifications)

[Deliverables](#deliverables)

[Working on the Assignment](#working-on-the-assignment)

[Bug Fixes](#bug-fixes)

### Problem Description

You will be implementing the MixedNumber class which utilizes an already-implemented Fraction class.

See [Lab5.pdf](Lab5.pdf) for more detailed instructions.

### Requirements

1. Fulfill the requirements as given by [the instructions](Lab5.pdf).
2. Test your MixedNumber class using (ideally) a JUnit Test class or at least a separate ```main()``` program.
3. Push your code back to your assignment 5 Github repository.

### Design Specifications

1. Implement the API as specified by the Class UML diagram in [the instructions](Lab5.pdf). 
2. Use the UML diagram's spelling and capitalization for the function names.
3. Have your functions return the same data type as specified by the UML diagram.
4. Have your function parameters match the data types given by the UML diagram.
5. MixedNumbers should obey the following negativity rules:
  1. The negativity of a MixedNumber should be represented by its whole part if it has one, or the numerator of the Fraction if it does not.
  2. The MixedNumber should be negative if either the whole number or the fraction is negative (but not both).
  3. The MixedNumber should be positive if both the whole number and the fraction are negative.
6. All MixedNumbers should automatically be simplified.
7. When constructing a MixedNumber from a Fraction, use the Fraction's copy Constructor (```public Fraction(Fraction objectToCopy)```) to avoid making a shallow copy.
8. Arithmetic operations on MixedNumbers return new MixedNumbers instead of altering the existing MixedNumbers.
9. The first line in MixedNumber.java, Fraction.java, and FractionException.java should be ```package edu.wvu.cs111.assignment5;```

### Deliverables

Each student is to complete the assignment individually.  You may discuss ideas with others, but avoid sharing multiple lines of code.

To submit your code, push the project back to your assignment 5 Github repository. Your grade will be based on your successful completion of the requirements and specifications as well as code style.

I will be using an automated form of testing in order to grade the correctness of your code. Every time you push your code to your repository, a program will automatically run a set of tests against your code. However, only your last push prior to the deadline will be used to determine your grade. At this time, you are not able to see results of the automated testing. I will strive to have this feature available for future lab assignments.

#### Submission Deadline

This assignment is due in one week prior to the start of the next lab.

### Working on the Assignment
I will work on creating a single file with instructions on working with Github through Eclipse. For the time being, you can refer to the previous labs' (3 and 4) readme files.

You will need to refer to the included Fraction class for how to work with Fraction objects.

### Bug Fixes
Issues were found with the Fraction class and .classpath file.
Replace the Fraction.java class and .classpath files in your repository with the Fraction.java and .classpath files in this repository.
