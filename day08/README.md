## Day Eight

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Understand how to use interfaces in Java, and use them in your programs.
  * Understand how stacks, queues, and maps work.
  * Strenghten your understanding of pointers, and how they are used in dynamic data structures.

### 1. Supermarket queue

Use the interface [PersonQueue] [1] that represents a queue of people waiting at the supermarket and then implement it. (...)
You can reuse any version of class [Person] [2] from past days. (...) Then create a class [Supermarket] [3] that has two methods:
`addPerson(Person)` and `servePerson()`. These methods must call appropriate methods of **PersonQueue**.

*created class* [PersonQueueLinkedListImpl] [4]

### 2. Supermarket queue revisited (*)

Implement the interface [PersonQueue] [1] in a different way. Then check that it works exactly the same without 
changing either the interface or your class [Supermarket] [3].

*to be implemented*

### 3. Foreign people, different queues (*)

Get a queue implementation from one of your colleagues. Use it and check that it works exactly the same
without changing either the interface or your class [Supermarket] [3] (...).

*to be implemented*

### 4. Unfair queue (*)

#### 4.1 Simple

Implement the interface queue in a way that the person at the end (i.e. the person that is retrieved
next time the method `retrieve()` is called) is always the oldest person.

*created class* [PersonQueueOldestImpl] [5] 

#### 4.2 Clustered

Implement the interface queue in a way that the next person retrieved is always a person over 65, if there is any
in the queue; if not, it must be a person over 18, if there is any in the queue. Inside each age category, the behaviour
of the queue is typical FIFO: first in, first out.
These two queues are examples of *priority queues*, and are not strictly FIFO: old people will always come out of the queue
before younger people, even if the youngsters came to the queue first. Priority queues are more difficult to implement, but 
they are also important in computing. For example, your hard disk uses a priority queue to decide where to move next: if the 
disk's head is at position 555 and the queue of request is
	4, 99, 234, 500, 101, 43, 881, 77
your disk may decide to move to position 500 to reduce movement, time, and energy consumption.

*created class* [PersonQueuePriorityListImpl] [6]

### 5. Maps

#### 5.1 Hash function

Create a class [HashUtilities] [7] that implements a simple hash function `shortHash(int)` that takes any integer
and returns an integer between 0 and 1000. You can use the modulo operator and the static funciton `Math.abs(int)`
for obtaining the absolute value of an integer.
Note that `shortHash(int)` is a pure function (it does not have any side effects), so it should be `static`. 
Then you can call this method using the name of the class like `HashUtilities.shortHash(int)`.
Every object in Java has the method `hashCode()`, that returns an `int`.
[Test] [8] you hash function by passing the hash codes of different objects and verifying that it always returns
a number between 0 and 1000, as in the following example:

```
println "Give me a string and I will calculate its hash code";
String str = System.console().readLine();
int hash = str.hashCode();
int smallHash = HashUtilities.shorthash(hash);
System.out.println("0 < " smallHash + " < 1000");
```

#### 5.2 Simple map

Create a class that implements the following [interface] of a simple map from integers to strings. (...)

*created class* [SimpleMapImpl] [9]

#### 5.3 Hash table (*)

Create a class that implements the following [interface] of a simple map from integers to strings:
it is a one-to-many mapping. A similar map is used in some countries to classify the citizens into groups
for tax purposes (so that each department has a limited number of citizens to examine and process).

Hint: You can implement it with arrays or with linked lists. You do **not** know in advance how many strings
you will receive for every key.

*created class* [HashTableImpl] [10]

	




[1]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/E01-02-03-04-Supermarket-Revisited-Foreign-UnfairQueue/PersonQueue.java
[2]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/E01-02-03-04-Supermarket-Revisited-Foreign-UnfairQueue/Person.java
[3]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/Supermarket.java
[4]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/PersonQueueLinkedListImpl.java
[5]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/PersonQueueOldestImpl.java
[6]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e01_to_04_queues/PersonQueuePriorityListImpl.java
[7]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/HashUtilities.java
[8]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/HashTest.java
[9]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/SimpleMapImpl.java
[10]: https://github.com/BBK-PiJ-2014-21/Lab-Exercises/blob/master/day08/e05_maps/HashTableImpl.java