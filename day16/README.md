## Day Sixteen

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Read from text files.
  * Write to text files.

### 1. ls

Write a program that shows on screen the names of the files in the current directory.
(Hint: look at methods from class File).

(*created class [ListCurrentDirectory] [1]*)

### 2. mkdir

Write a program that takes a name from the user at the command line and creates a directory with that name.
Remember that the only argument of method `main` is an array of Strings, each of them an argument written after
the name of the class. For example, if you write `java myClass this That 0`, the elements in `args` will be three
strings of values "this", "That", and "0".

(*created class [Mkd] [2]*)

### 3. cat

#### a)
Write a program that takes a name from the user at the command line. If a file with that name exists, the program
must show its content on screen. If it does not, the program must say so.

#### b) (*)
Modify the program so that it takes many file names at the command line, and then shows them all one after the other.

### 4. cp

#### a)
Write a program that takes two names from the user at the command line. If a file with the first name exists, the 
program must copy it into a file with the second name.
    If the first file does not exist, the program must say so. If the second file does exists, the program must ask the
user whether to overwrite it or not, and act accordingly.

#### b) (*)
Modify the program so that it takes many file names at the command line. When this happens, the last name must 
be a directory (otherwise, your program should complain). If it is a directory, your program has to copy all files
(i.e. the other arguments) into that directory.




[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/Book.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/TestBook.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/BookImpl.java
[4]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/User.java
[5]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/TestUser.java
[6]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/UserImpl.java
[7]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day13/src/practicingTDD/Library.java
