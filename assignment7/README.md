# Lab Assignment 7
## Prefix Expressions with Queues

### Table of Contents 

[Problem Description](#problem-description)

[Requirements](#requirements)

[Design Specifications](#design-specifications)

[Working on the Assignment](#working-on-the-assignment)

[Deliverables](#deliverables)

### Problem Description
In this lab, you will parse and evaluate prefix expressions using a queue. An expression written with [prefix notation](https://en.wikipedia.org/wiki/Polish_notation) places the operator before the operands. Prefix notation removes the need for parenthesis.

| Infix         | Prefix      |
| ------------- | ----------- |
| 2 - 3         | - 2 3       |
| 2 * ( 2 + 3 ) | \* 2 + 2 3  |


### Requirements
1. Write a function to _tokenize_ an expression.
2. Write a function to evaluate the tokenized expression and return the result.

_Tokens_ are the individual elements of an expression. In this case our tokens are operators and operands.  For the purposes of this exercise, a valid operand is any integer value. Valid operators will be limited to: + - \* \\

You will be given unit tests. Use the unit tests to discern expected behaviors and to check your solutions. Study the unit tests so you can learn how to create them. Also, review the expressions.txt file in your project's data folder to see the expressions used for testing.

### Design Specifications
You must use the given ```Queue``` of tokens to evaluate the expression. If the expression contains invalid tokens, the ```tokenize``` function should throw an ```IllegalArgumentException```. Furthermore, if the expression itself is not a valid mathematical expression, the ```evaluate``` function should also throw an ```IllegalArgumentException```.

You may create helper functions to check if tokens are valid, or if a token is an operator or integer.
In addition to running the unit tests, you may use the ```main()``` function to test your code. You can call the ```readExpressions``` method to get a List of Strings, where each String is an expression. You can then pass a String into the tokenize function.

### Working on the Assignment
1. **Write the tokenize method:** Begin by creating an empty ```Queue<String>()```. To help you tokenize, see the ```.split()``` method: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String- . Once you've split the String into an array of substrings, check each element to see if it is a valid token (you may want use ```Integer.parseInt``` to test if the token is an integer). If it is, ```enqueue``` it. Otherwise, throw the ```IllegalArgumentException```. Return the queue when done.
2. **Write the evaluate method:** The evaluate method will receive the ```Queue<String>``` of tokens. Use the ```peek``` and ```dequeue``` methods to access the next element in the queue. The general algorithm for evaluating a prefix expression using a queue is as follows:
  1. First, check if the first token in the queue is an operator. If not, then the expression is not valid.
  2. Repeat the following steps until the result is returned or the expression is determined to be invalid:
    1. Dequeue up to three token from the queue
    2. If there was only one token in the queue, and it's a number, return it as the answer.
    3. Otherwise, if there were fewer than three tokens left, we do not have a valid expression.
    4. If the three tokens can be evaluated (an operator followed by two operands), evaluate it and enqueue the result.
    5. Otherwise, enqueue the first of three tokens back into the queue.

### Deliverables
You are to complete the assignment individually, however you may discuss ideas with others.

To submit your code, push your code back to your Github repository. For each submission, you will receive an email containing the results of my secret JUnit tests. Your grade will be based on your last push prior to the deadline. You may submit your code multiple times prior to the deadline.

#### Submission Deadline
This assignment is due **by the end of this lab**.
