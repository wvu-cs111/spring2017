# Lab Assignment 8
## Postfix Expressions with Stacks

### Table of Contents 

[Problem Description](#problem-description)

[Requirements](#requirements)

[Design Specifications](#design-specifications)

[Working on the Assignment](#working-on-the-assignment)

[Deliverables](#deliverables)

### Problem Description
In this lab, you will parse and evaluate postfix expressions using a **stack**. An expression written with [postfix notation](https://en.wikipedia.org/wiki/Reverse_Polish_notation) places the operator after its operands. Like prefix notation, postfix notation is parentheses free, and easily evaluated without worrying about the precedence and associativity of operators. Refer to [Understanding Prefix And Postfix Notation](Understanding_Prefix_And_Postfix_Notation.pdf) for additional help completing this assignment.

| Infix         | Prefix      |
| ------------- | ----------- |
| 2 - 3         | 2 3 -       |
| 2 * ( 2 + 3 ) | 2 2 3 + \*  |


### Requirements
1. Write a function to _tokenize_ an expression. It should return an array of Strings.
2. Write a function to evaluate the tokenized expression and return the result.

_Tokens_ are the individual elements of an expression. In this case our tokens are operators (+, -, \*, \\) and operands.  Each token in the test expressions will be separated by a space. For the purposes of this exercise, a valid operand is any legal unsigned integer. Valid operators will be limited to: + - \* \\

The evaluate function does not need to process floating point values. It is sufficient to perform integer division.

You will be given unit tests. 
* Use the unit tests to discern expected behaviors and to check your solutions. Study the unit tests so you can learn how to create them. 
* If a test is failing, place a breakpoint on the line in the test which calls your method. Then, run the debugger. Use the Step Over button to execute the entire line of code and move to the next. Use the Step Into button to begin executing the code within a function call on current line. 
* Review the expressions.txt file in your project's data folder to see the expressions used for testing.

### Design Specifications
There is a generic Stack class in your project folder. It will be used by the evaluate method. 

To help the tokenize method, you may wish to create helper functions to check if a token is a valid operand or if it is a valid operator. If the expression contains invalid tokens, the tokenize method should throw an ```IllegalArgumentException```. Furthermore, if the expression itself is not a valid mathematical expression, the evaluate method should also throw an ```IllegalArgumentException```.

### Working on the Assignment
**Write the tokenize method:** Given a single parameter which is a String containing a postfix expression, use the ```.split()``` method to break the string into an array of substrings where each element is a token.  To help you tokenize, see the ```.split()``` method: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String- . Once you've split the String into an array of substrings, check each element to see if it is a valid token:
  * Each substring must either be an operand or an operator.
  * To test for an operand:  You may reuse code from last week's lab.  There are not methods in the Java API to test if a String is a valid representation of a number.  You could try Integer.parseInt realizing that it will throw an exception if the string is not an integer (operators will trigger an exception).  If you choose this route, use a try/catch block. Alternatively, you can code a Boolean method isOperand which receives a String as a parameter and returns true if each character in the substring contains one of the characters ‘0’ – ‘9’.
  * If the substring is not an operand, test if it is one of the operators.
  * If it is not an operand or operator, then the tokenizer methods should throw an ```IllegalArgumentException```.
  * If all of the substrings are valid tokens, return the array of substrings.


**Write the evaluate method:** The evaluate method will receive an array of Strings where each element is a token.  It will allocate an empty ```Stack<Integer>``` to evaluate the expression.   The general algorithm for evaluating a postfix expression using a stack is as follows: 

1. Iterate through the array of tokens one at a time:
  1. If the current token is an operand, convert it to an int (using ```Integer.parseInt```)   and push it onto the Stack.
  2. If the current token is an operator:
    1. If the size of the stack is < 2, this is an invalid postfix expression.  Throw an ```IllegalArgumentException```.
    2. If the size of the stack is >= 2 ,  **pop** two values from the stack.  The first value popped becomes ```operand2```, and the second becomes ```operand1```.  Evaluate the subexpression as: ```operand1  operator  operand2``` (if the operation is division, performing integer division is sufficient)
    3. **Push** the result of the subexpression back onto the stack
  3. Continue until all tokens in the array have been processed.
    1. If the size of the stack is 1, pop and return your answer.
    2. If the size of the stack is > 1, the expression is invalid and your program should throw an ```IllegalArgumentException```.


### Deliverables
You are to complete the assignment individually, however you may discuss ideas with others.

Submit the ```PostfixExpressionEvaluator.java``` file via ECampus. You may push your code to Github, but this code will not be graded.

#### Submission Deadline
This assignment is due **by the end of this lab**.
