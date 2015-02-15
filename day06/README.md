## Day Eight

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Become familiarised with the use of `private` and `public`. All your classes, fields, and methods should specify
    explicitly whether they are public or private according to the rules of thumb in the notes. If you make a decision
    of visibility that deviates from those rules, you should explain why in a comment.
  * Related to the former point, you should become used to use constructors in all your classes. 
    The constructor method or methods should be used to initialise the fields of any new object of that class.
  * Be able to create classes in their own `.java` file, compile them using `javac`, and use those classes from Groovy 
    or Java Decaf programs.
  * Be able to cast simple types from one type to another.
  * Be able to create and use arrays in one or more dimensions.

### 1. Dividing integers

Create a Java class called `Calculator`. The class should implement the following methods, each of them printing
the result on the screen.
    * **add(int, int)**
    * **subtract(int, int)**
    * **multiply(int, int)**
    * **divide(int, int)**
    * **modulus(int, int)**
    Note that you will need to cast the parameters into `double` to perform exact division.
    Write a small Groovy or Java Decaf program that uses all the methods of `Calculator`.
    
(*created class* [] [1])

### 2. Copying arrays

(*to be implemented*)

### 3. Creating matrices

(*to be implemented*)

### 4. One-liners for matrices (*)

(*to be implemented*)

### 5. Symmetry looks pretty


### 6. Anti-aircraft aim (*)


### 7. Big enough (*)

Write a small program that asks for the names and IDs of all employees in a small company, and store them in an
array of integers and an array of Strings. (You will need to create a Java class to hold arrays, and to access them).
    This is similar to the example from the notes, but you do not know the number of the employees in advance.
Read the names and IDs of employees until the user enters an empty name (i.e. length 0) or an ID equal to 0.
    Once you have finished reading employee data, go through the employee list and print the names and IDs of 
those employees whose ID is even or their names start with "S".
    (Hint: As you do not know how many employees you need in advance, you will need a growing array. Create
a small array, if it gets full create an array twice as big, copy all data to the new array, and discard the old 
array, etc).

(**)




[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/E01-02-03-04-Supermarket-Revisited-Foreign-UnfairQueue/PersonQueue.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/E01-02-03-04-Supermarket-Revisited-Foreign-UnfairQueue/e03_practiceFindBugsOnce.Person.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/Supermarket.java
[4]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/PersonQueueLinkedListImpl.java
[5]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/PersonQueueOldestImpl.java
[6]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/PersonQueuePriorityListImpl.java
[7]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/HashUtilities.java
[8]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/HashTest.java
[9]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/SimpleMapImpl.java
[10]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/HashTableImpl.java
[11]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/SimpleMap.java
[12]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/HashTable.java