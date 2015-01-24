## Day Twelve

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Understand the importance of automated testing.
  * Write your own tests for classes already defined.
  * Execute your own tests for classes already defined.

### 1. Install JUnit 4

(*JUnit and HamCrest installed on /lib folder for command-line use. Already available in IntelliJ library*)

### 2. Testing mathematical functions

On Day 7 you implemented a simple hash. Write a battery of tests to verify its behaviour, paying special attention 
to border cases.
    Hint: Implement a loop that tries a fair amount of random numbers (around two thousand, for the purpose of this
this exercise) and verify that the output is within the range.

(*created class* [HashUtilitiesTest] [1])

### 3. Practice "Find bugs once"

The method `getInitials(String)` has a bug! If you introduce a name with more than one space between words,
it throws an exception. 
Create a class that contains the method `getInitials(String)` as described in the notes. Create also the test
class as described in the notes.
Then follow the "find bugs once" algorithm: reproduce the bug manually, reproduce the bug programmatically by
adding a new test to the testing class, then fix the bug and check that all tests pass.

(*Copied class* [Person] [2] *from the notes, added class* [PersonTest] [3])

### 4. Test implementations of a given interface

You already know that an interface is a way of describing the behaviour of a class without any knowledge about
the implementation details. Sometimes, one party provides the interface of a component and the other party implements
the interface. This is very common in big projects, where small teams of programmers make parts of a bigger program
(e.g. web browsers, word processors, multiplayer games), and the different modules need to communicate with each other.
Defining clear and simple interfaces is usually the first step in the design, as it allows different teams to work
in parallel and then bring their code together.
    Sometimes, the first party does not only define the interface, it also implements the tests that the implementation
(i.e. the class that implements the interface) must pass. This is a good idea when the development is sub-hired to an
external company. Take the role of a project leader and implement the tests for two of the interface you have implemented
in past weeks.

#### 4.1 Stack

The notes from Day 8 implemented a Stack interface in two different ways. Create a battery of tests that verify
that the classes implementing the interface is working as expected. Use it to test both implementations.

(*created class* [StackTest] [4] *on interface* [StringStack] [5] *testing* [ArrayStringStack] [6] *and* [PointerStringStack] [7])

#### 4.2 Queue

You implemented a Queue interface -maybe in two different ways- on Day 8. Create a battery of tests that verify
that the class(es) implementing the interface work/s as expected.

(*to be implemented*)

#### 4.3 Set (*)

You implemented a Set interface -possibly in two different ways- on Day 9. Create a battery of tests that verify
that the class(es) implementing the interface work as expected.

(*to be implemented*)

### 5. Testing dynamic structures

Write batteries of tests to verify the functionality of the dynamic structures you have created in past weeks:
    * doubly-linked list (day 7)
    * circular list (day 7)
    * simple map (day 8)
    * sorted list (day 7)
    Make sure that you test border cases, including situations like:
    * Adding the first element.
    * Removing the last element.
    * Adding the first element and then removing it... and then adding another one.

(*to be implemented*)

### 6. More tests (**)

If you have finished with the other exercises, write additional batteries of tests for other programs (in particular,
the exercises marked with a star) that you have written in past weeks. Some exercises that provide a harder challenge 
to test properly are:
    * the anti-aircraft game from day 6
    * any of the sort algorithms from day 7
    * any of the unfair queues from day 8
    * the hash-table (day 8)
    * deletion of elements in a tree (day 9)
    * re-balancing of a tree (day 9)
    * the abstract syntax tree (day 9)
    * the pseudo-git tree (day 9) (**)

[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day12/src/e02_testingMathematicalFunctions/HashUtilitiesTest.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day12/src/e03_practiceFindBugsOnce/Person.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day12/src/e03_practiceFindBugsOnce/PersonTest.java
[4]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day12/src/e04_testImplementationsOfInterface/StackTest.java
[5]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/src/stringStack/StringStack.java
[6]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/src/stringStack/ArrayStringStack.java
[7]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/src/stringStack/PointerStringStack.java
