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

(*created class [Cat] [3] and [CatLaunch] [4]*)

#### b) (*)
Modify the program so that it takes many file names at the command line, and then shows them all one after the other.

(*modified class [CatLaunch] [4]*)

### 4. cp

#### a)
Write a program that takes two names from the user at the command line. If a file with the first name exists, the 
program must copy it into a file with the second name.
    If the first file does not exist, the program must say so. If the second file does exists, the program must ask the
user whether to overwrite it or not, and act accordingly.

(*created class [CopyFile] [5] and [CpLauncher] [6]*)

#### b) (*)
Modify the program so that it takes many file names at the command line. When this happens, the last name must 
be a directory (otherwise, your program should complain). If it is a directory, your program has to copy all files
(i.e. the other arguments) into that directory.

(*added method to [CopyFile] [5] and created class [CpDirLauncher] [7]*)

### 5. tr (*)

Write a program that takes a name and two strings from the user at the command line. If a file with that name exists,
the program must show its contents on screen, but substituting any occurrence of the first string by the second string.
If the file does not exist, the program must say so.

(*created class [Tr] [8] and [TrLaunch] [9]*)

### 6. sort (*)

Write a program that takes a name from the user at the command line. If a file with that name exists, the program
must show its contents on screen, but with the lines shown alphabetically. If it does not exist, the program must
say so.
    Hint: Remember that Strings in Java implement the interface `Comparable<String>`.

(*created class [Sort] [10] and [SortLaunch] [11]*)

### 7. uniq (*)

Write a program that takes a name from the user at the command line. If a file with that name exists, the program
must show its contents on screen, but removing duplicates lines (showing on screen only one line for each set of
duplicated lines). If the does not exist, the program must say so.

(*created class [Uniq] [12] and [UniqLaunch] [13]*)

### 8. Temperature averages

Write a program that reads a file from disk in comma-separated format (CSV). Every line must contain a list of
number separated by commas.
    The program must output the average for every line plus the average for the whole file. A file may look like the
following:
```
25, 24, 20, 18, 15, 13, 14, 13, 15, 17, 19, 21
25, 25, 24, 20, 18, 15, 13, 14, 13, 15, 17, 19
21, 25, 25, 24, 20, 18, 15, 13, 14, 17, 19, 21
25, 25, 24, 20, 18, 15, 13, 14, 13, 15, 17, 19
21, 25, 25, 24, 20, 18, 15, 13, 14, 13, 15, 17
21, 25, 25, 24, 20, 18, 15, 13, 14, 13, 15, 17
19, 21, 25, 25, 24, 20, 18, 15, 13, 14, 13, 15
17, 19, 21, 25, 25, 24, 20, 18, 15, 13, 14, 13
...
```

(*created class [TempCalc] [14] and [TempLaunch] [15]*)

### 9. Binary cp (**)

Write a program that takes two names from the user at the command line. If a file with the first name exists, the
program must copy it into a file with the second name. If the first file does not exist, the program must say so. If
the second file does exists, the program must ask the user whether to overwrite it or not, and act accordingly.
This is the same exercise as above with an important difference: it must be able to copy binary files (use
`InputStream` instead of `Reader`, etc). Try it with **.class** and **.exe** files and check that the copies work 
exactly like the originals.

(*to be implemented*)



[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/listDir/ListCurrentDirectory.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/makeDir/Mkd.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/concatenate/Cat.java
[4]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/concatenate/CatLaunch.java
[5]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/concatenate/CopyFile.java
[6]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/concatenate/CpLauncher.java
{7}: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/concatenate/CpDirLauncher.java
[8]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/transliterate/Tr.java
[9]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/transliterate/TrLaunch.java
[10]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/sort/Sort.java
[11]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/sort/SortLaunch.java
[12]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/uniq/Uniq.java
[13]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/uniq/UniqLaunch.java
[14]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/tempAverages/TempCalc.java
[15]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day16/src/tempAverages/TempLaunch.java

