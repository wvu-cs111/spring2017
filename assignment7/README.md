# Lab Assignment 7
## Prefix Expressions with Queues

### Table of Contents 

[Problem Description](#problem-description)

[Requirements](#requirements)

[Design Specifications](#design-specifications)

[Deliverables](#deliverables)

[Working on the Assignment](#working-on-the-assignment)

### Problem Description

In this lab, you will parse and evaluate prefix expressions using a queue. An expression written with [prefix notation](https://en.wikipedia.org/wiki/Polish_notation) places the operator before the operands. Prefix notation removes the need for parenthesis.

| Infix         | Prefix      |
| ------------- | ----------- |
| 2 - 3         | - 2 3       |
| 2 * ( 2 + 3 ) | \* 2 + 2 3  |

### Requirements
1. Write a function to _tokenize_ an expression.
2. Write a function to evaluate the tokenized expression and returns the result.

_Tokens_ are the individual elements of an expression. In this case our tokens are operators and operands.  For the purposes of this exercise, a valid operand is any integer value. Valid operators will be limited to: + - \* \\

### Design Specifications
You must use the given ```Queue``` of tokens to evaluate the expression. If the expression contains invalid tokens, the ```tokenize``` function should throw an ```IllegalArgumentException```. Furthermore, if the expression itself is not a valid mathematical expression, the ```evaluate``` function should also throw an ```IllegalArgumentException```.

You may create helper functions to check if tokens are valid, or if a token is an operator or integer.

### Deliverables

You are to complete the assignment individually, however you may discuss ideas with others.

To submit your code, push your code back to your lab 6 Github repository. For each submission, you will receive an email containing the results of my secret JUnit tests. Your grade will be based on your last push prior to the deadline. You may submit your code multiple times prior to the deadline.

#### Submission Deadline

This assignment is due **by the end of this lab**.

### Working on the Assignment
Tips:

