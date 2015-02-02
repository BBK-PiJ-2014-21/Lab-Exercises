## Day Thirteen

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Strengthen your knowledge of JUnit 4, practicing the use of the new annotations.
  * Understand the Test-Driven Development methodology.

### 1. Practicing TDD:

Write a simple application for keeping track of the books in a library. The functionality will be described
incrementally by stages. At every stage, you must follow the following steps:
1. Write (or update) the interface(s) for the new functionality required.
2. Generate the tests for the functionality required at that stage. The tests may not even compile at this point.
3. Write the bare minimum code of the classes implementing the interfaces to make the test-class(es) compile.
   Check that the new tests fail while the old ones pass.
4. Write the minimum code in the methods of the implementing class(es) that makes all the new tests pass.
5. Refactor the code to make it clearer, if needed. Your first implementation may not be as clear as possible.
   Think of the next programmer that will come after you: will they understand the code easily? Are variable names
   clear and descriptive? Can you simplify those `for` loops and/or those `if...else` branches?
6. Document the code if it has not been done yet. Update the JavaDoc documentation (on a separate www folder)
   using the command `javadoc`. Use your browser to check that it works and is easy to read.

#### 1.1

Create a class for books. Books have authors and titles. The class should implement getters for both author name
and title, but these must be set at construction time and never be modified afterwards.
(An object whose field cannot be changed after construction is called an *immutable* object.)

(*created interface [Book] [1], test class [TestBook] [2] and implementation class [BookImpl] [3]*)

#### 1.2

Create a class for the users of the library. Users have a name and a library-ID (an `int`), both of which must be
unique in a library. The name is set at construction time, but the library-ID is not. The class must implement
methods to get the name of the person and their ID, and to set the latter.

(*created interface [User] [4], test class [TestUser] [5] and implementation class [UserImpl] [6]*)

[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/Book.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/TestBook.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/BookImpl.java
