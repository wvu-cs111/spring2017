# Lab Assignment 4
## Implementing an ArrayList

### Table of Contents 

[Problem Description](#problem-description)

[Requirements](#requirements)

[Design Specifications](#design-specifications)

[Deliverables](#deliverables)

### Problem Description

In Lab Assignment 3, we worked with a program which allowed a user to interact with a grocery list. Through the program's menu system, the user could perform a limited number of actions on the grocery list. The actual implementation of the grocery list was relied on the array **[data structure]**(https://en.wikipedia.org/wiki/Data_structure). The user's actions were translated into operations on the array itself. This setup conceals the underlying implementation of the list. In doing so, the user does not have to worry about low-level details when working with the grocery list. Whereas in the grocery list program we created a set of functions within the main program to manipulate the array, these abstractions more often exist as classes of their own.

A Java [ArrayList](http://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html) is a **data structure** implementing the List [**abstract data type**](https://en.wikipedia.org/wiki/Abstract_data_type) similar to the grocery list. Through the ArrayList's class interface, it provides a convenient set of methods for working with collections of data. Internally, the ArrayList uses a standard Array to store the data. The low-level details of managing the array are encapsulated by the ArrayList class.

In this lab, we will encounter the following new topics:
* The Basics of Classes
* Data Structures vs. Abstract Data Types (ADTs)
* Deep vs. Shallow copies
* Overloaded Methods

### Requirements

In this assignment, you will implement a lightweight version of an ArrayList class. You may refer to the Java code and documentation for guidance, but you must write the implementation yourself. Additionally, you must write javadocs as well as unit tests for the class's methods. The use of good style is now a requirement. Furthermore, you must remain in lab for the entirety of the class period unless you can demonstrate that you have correctly completed the assignment and understand the topics involved.

### Design Specifications

You must implement the MyArrayList class with the following public methods.

```java
// Constructors
MyArrayList(int initialCapacity)
MyArrayList()
// Required public methods
get(int index)
set(int index, E element)
size()
indexOf(Object o)
isEmpty()
remove(int index)
remove(Object o)
removeRange(int fromIndex, int toIndex)
clear()
contains(Object o)
clone()
toArray()
```

Your public interface must exactly conform to the above function declarations (including spelling and capitalization).  These methods must produce the same end result as the corresponding methods in Java's ArrayList class. However, your underlying implementation can (and probably will) differ. Internally, you are to implement MyArrayList using the Array data structure. The methods must throw exceptions where necessary. MyArrayList must be able to grow in size to store a number of elements beyond its initial capacity. Some methods may also require MyArrayList to shrink in size. Also be careful to use [**deep or shallow copies**](https://en.wikipedia.org/wiki/Object_copying#Methods_of_copying) as necessary.

You must write a test class to validate MyArrayList against all potential use cases. All method declarations (public and private) must be preceded with a javadoc block comment.

#### Bonus Objectives

An additional bonus point will be awarded for each of the following public methods you successfully implement:
```java
MyArrayList(Collection<? extends E> c) // Constructor
addAll(Collection<? extends E> c)
addAll(int index, Collection<? extends E> c)
removeAll(Collection<?> c)
retainAll(Collection<?> c)
```
To see how to work with Collection objects, make use of the [javadocs](http://docs.oracle.com/javase/8/docs/api/java/util/Collection.html).

### Deliverables

This is an **individual assignment**, though you may discuss ideas with one another.

Your submission must contain:
* MyArrayList.java 
* MyArrayListTest.java

Neither file should contain a ```main``` method.

#### Submission Deadline
This assignment is due prior to the start of the next lab. This is a hard deadline - **no late work will be graded**.
