## Day Eleven

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Create generic classes
  * Use generic classes
  * Overloads methods
  * Prevent code repetition in overloaded methods
  * Upcast objects to more general types
  * Downcast objects to more specific types

### 1. Don't Repeat Yourself

Look at the following code. Is there anything you can do to make this code better? 
    Hint: you may need to convert between types (e.g. casting).
```
public class dry.Comparator {
    public int getMax(int n, int m) {
        if (n > m) {
            return n;
           } else {
            return m;
        }
    }
    public double getMax(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }
    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        if (n1 > n2) {
            return number1;
        } else {
            return number2;
        }
    }
}
```

(*created class [Comparator] [1] and [ComparatorTest] [2]*)

### 2. Upcasting, downcasting

For this exercise, you will need to use again some classes and interfaces you created last day:
`Phone`, `OldPhone`, `MobilePhone`, `SmartPhone`.

#### 2.1 Start

Create a script that builds a new `SmartPhone` with the line:
```
SmartPhone myPhone = new SmartPhone();
```
and then uses all its methods.

(*created class [SmartPhoneLauncher] [3]*)

#### 2.2 Direct upcasting

Change the script so that the `SmartPhone` is created with the line:
```   
MobilePhone myPhone = new SmartPhone();
```
Compile your code again. Are there any problems? Why do this problems happen?
What are the possible solutions?

(*A variable of superclass `MobilePhone` doesn't have access to methods specific of the subclass `SmartPhone`;
`browseWeb` and `findPosition`, and also `playGame` which is private in `MobilePhone` but public in `SmartPhone`. 
One solution would be to declare the variable as `SmartPhone` (as done for exercise 2.1), 
otherwise another solution could be to typecast the `MobilePhone` variable.*)

#### 2.3 Indirect upcasting when calling a method

Pass this object to a method `testPhone(Phone)` that has only one parameter of type `Phone`.
What methods can you call on the object inside the method?

(*This method takes as parameter an object of type `Phone`, so any subclass will indirectly be upcasted, 
and inside `testPhone(Phone)` only methods from superclass `Phone` can be directly called.*)

#### 2.4 Downcasting

Inside the former method, downcast the object to `SmartPhone` so that you can use all the public methods
of `SmartPhone`.

(*Typecasting the object down to `SmartPhone` let it use its methods - as done for exercise 2.2*)

#### 2.5 Casting exception

Create a `MobilePhone` object and then pass it to method `testPhone(Phone)`. What happens?

(*Exception in thread "main" java.lang.ClassCastException: phone.MobilePhone cannot be cast to phone.SmartPhone*)

### 3. Generic list

Modify the doubly-linked list that you have created in past weeks to make it generic, i.e. to allow it to have values
of its elements of any type.
    Once you have it ready, create a class `Company` that keeps two linked lists, one with the names of the employees
and one with their National Insurance Number.

(*created classes [GenericDoublyLinkedList] [4], [GenericNode] [5], [Company] [6] and [CompanyTest] [7]*)

### 4. Sorted list (*)

Extend your class from the former exercise to create a sorted list. You may need to override the method that adds
new elements to the list. The subclass should be generic.

(*to be implemented*)

### 5. Generic stack

Create a generic stack (with methods for pushing, popping, and checking emptiness) that only works with classes
that extend `Number` (e.g. Integer and Double, but not String).

(*created classes [GenericStack] [8] and [NumberNode] [9]* )

### 6. Generic maps

#### 6.1 Simple map (*)

Create a generic simple map (with methods for putting a key-value pair, getting the value for a key, and removing
a key). The key and the value may be any type, and they may be different. Each key can only be linked to one value.
For simplicity, assume that your map can hold a maximum of 1000 pairs. This way, you can use the hashing method
you developed in past weeks and base your map on an array.

(*to be implemented*)

#### 6.2 Hash table (*)

Crete a generic map (with methods for putting a key-value pair, getting the value for a key, and removing a key).
The key and the value may be any type, and they may be different. Under each key, the hash table can store any
number of values associated to that key.
    For simplicity, assume that your map can hold a maximum of 1000 pairs. This way, you can use the hashing 
method you developed in past weeks and base your map on an array.

(*to be implemented*)

[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/dry/Comparator.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/dry/ComparatorTest.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/upcastingDowncasting/SmartPhoneLauncher.java
[4]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/genericLists/GenericDoublyLinkedList.java
[5]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/genericLists/GenericNode.java
[6]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/genericLists/Company.java
[7]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/genericLists/CompanyTest.java
[8]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/commit/cdf47863bce0072a07dac1607e129a6af8db3c86
[9]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day11/src/genericStack/NumberNode.java
