## Day Five

### Learning Goals

Before the next day, you should have achieved the following learning goals:
  * Be able to write recursive for simple problems.
  * Understand what a recursive method looks like, and how it differs from an iterative method.
  
### 1. Recursive code, line by line

#### a)

What number would the following method print on screen if you called `printNumber(6)`?

*NOTE*: `printLine()` method has been swapped to `println()` as the former is not accepted in Groovy.

<pre>
<i>1</i> 	void printNumbers(int n) {
<i>2</i>		if (n < = 0) {
<i>3</i>			return;
<i>4</i>		}
<i>5</i>		println(n);
<i>6</i>		printNumbers(n-2);
<i>7</i>		printNumbers(n-3);
<i>8</i>		println(n);
<i>9</i>	}
</pre>

This should be the flow of execution for input `printNumbers(6);`:

<pre>
<b>printNumbers(6)</b>
	<i>output 6</i> [line 5]
	call method printNumbers(4) [line 6]
		<b>printNumbers(4)</b> 
			<i>output 4</i> [line 5]
			call method printNumbers(2) [line 6]
			<b>printNumbers(2)</b>
				<i>output 2</i> [line 5]
				call method printNumbers(0) [line 6]
					printNumbers(0) returns;
				call method printNumbers(-1) [line 7]
					printNumbers(-1) returns;
				<i>output 2</i> [line 8]
			<b>printNumbers(2) returns</b>;
			call method printNumbers(1) [line 7]
				<b>printNumbers(1)</b>
					<i>output 1</i> [line 5]
					call method printNumbers(-1) [line 6]
						printNumbers(-1) returns;
					call method printNumbers(-2) [line 7]
						printNumbers(-2) returns;
					<i>output 1</i> [line 8]
				<b>printNumbers(1) returns</b>;
			<i>output 4</i> [line 8]
		<b>printNumbers(4) returns</b>;
	call method printNumbers(3) [line 7]
		<b>printNumbers(3)</b>
			<i>output 3</i> [line 5]
			call method printNumbers(1) [line 6]
				<b>printNumbers(1)</b>
					<i>output 1</i> [line 5]
					call method printNumbers(-1) [line 6]
						printNumbers(-1) returns;
					call method printNumbers(-2) [line 7]
						printNumbers(-2) returns;
					<i>output 1</i> [line 8]
				<b>printNumbers(1) returns</b>;
			call method printNumbers(0) [line 7]
				printNumbers(0) returns;
			<i>output 3</i> [line 8]
		<b>printNumbers(3) returns</b>;
	<i>output 6</i> [line 8]
<b>printNumbers(6) returns</b>;
</pre>

So the final output will be:

```
6
4
2
2
1
1
4
3
1
1
3
6
```

#### b)

Do you see anything wrong with the following code? How would you fix it?

	String buggyMethod(int n) {
		if (n == 0) {
			return "";
		}
		return n + " " + buggyMethod(n-2);
	}
	
The base case here will cover just an even input: if an odd number is passed to the parameter `n`, 
this recursive method will cause a stack overflow. The `==` on the base case could be replaced to 
a `<=`, so it will return as soon as the result is equal or less than zero.

#### c)

Do you see anything wrong with the following code? How would you fix it?

	String doggyMethod(int n) {
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		if (n <= 0) {
			return "";
		}
		return result;
	}

The base case here comes after the recursive methods calls, so it will never be reached: 
there will be a stack overflow for any input. The code could be changed moving the base case
before the recursive calls:

	String doggyMethod(int n) {
		if (n <= 0) {
			return "";
		}
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		return result;
	}

#### d) McCarthy's 91 function

Calculate the result of calling this method with arguments 50, 73, and 95. 
Note that the recursion on line 5 is a double.

	int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n+11));
		}
	}
	
	(Hint: If you get too confused, maybe writing a slightly modified version of this code 
	that prints the numbers on screen can help.)

This is the calculation for input `50`:

	mcCarthy91(50)
	mcCarthy91(mcCarthy91(61)
	mcCarthy91(mcCarthy91(mcCarthy91(72)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(83))
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(94)					
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(105)	
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(95)				
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(106)
	[...]
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(100)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(111)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(101)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(91)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(102)
	[...]
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(100)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(111)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(101)
	mcCarthy91(mcCarthy91(mcCarthy91(91)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(102)
	[...]
	mcCarthy91(mcCarthy91(mcCarthy91(100)
	mcCarthy91(mcCarthy91(mcCarthy91(mcCarthy91(111)
	mcCarthy91(mcCarthy91(mcCarthy91(101)
	mcCarthy91(mcCarthy91(91)
	mcCarthy91(mcCarthy91(mcCarthy91(102)
	[...]
	mcCarthy91(mcCarthy91(100)
	mcCarthy91(mcCarthy91(mcCarthy91(111)
	mcCarthy91(mcCarthy91(101)
	mcCarthy91(91)
	mcCarthy91(mcCarthy91(102)
	[...]
	mcCarthy91(100)
	mcCarthy91(mcCarthy91(111)
	mcCarthy91(110)
	91

The mechanism is the same for input `73` and `95` - actually, for any input which is less or equal than 101,
it seems like the result would be **91** (hence the name). Several layers will open up adding 11 to the input 
until a number larger than 100 is reached; then two recursions bounce back and forward by -10 to +11 (e.g 91 to 102, 
92 to 103 etc.) until 100 to 111 is reached: then one layer is "closed" (101 back again to 91), 
and the mechanism would start again until the first layer is finally closed at 91.

### 2. Classics

#### 2.1 a) Factorial
Write a small program with a method that calculates the factorial of an integer number as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.

(*created script [factorial.groovy] [1]*)

#### 2.2 b) Fibonacci

Write a small program with a method that calculates the n(th) element of the Fibonacci sequence as seen in the notes.
Is it easy to do this both iteratively and recursively? Try both ways and see which is more natural for you. If
one takes too long, try the other way.
When doing it recursively, do it with and without memoization. Compare the time that is needed in each case
to find F(40) or F(45).

(*created script [fibonacci.groovy] [2]*)

#### 2.3 c) Hanoi towers

A legend says that, somewhere in the East, near Hanoi, there is a temple. In the temple, there are three posts. In
the posts, there are 64 discs of 64 different sizes. When the world was created, all the discs were in the first post;
when all the discs are moved to the last post, the world will end.
The monks in the temple move the discs between posts, but they must obey two simple rules. First, only one
disc can be moved at a time, from one post to another post (it cannot be left anywhere else). Last, but not least,
a disc can only be placed on top of a bigger disc, never on top of a smaller disc. The smallest disc can be placed
on any post (all other discs are bigger); the biggest disc can only be placed on an empty post.
Create a method that calculates the number of moves necessary to move a set of n Hanoi disks from the initial
post to the last post.

(*created script [hanoiTowers.groovy] [3]*)

### 3. Paper sizes (*)

A Din-A0 sheet of paper is 841mm × 1189mm (its surface is one square meter). Successive measurements of paper
are defined recursively as "half" or "double" the preceding size. Therefore, a Din-A1 sheet of paper is half of
Din-A0, or 594mm × 841mm; while a Din-A00 is double of Din-A0, or 1189mm× 1682mm.
Create a method that takes a String parameter representing a size (e.g. "A4", "A00000") and prints on screen
the size of the corresponding sheet of paper. For simplicity, you can ignore rounding errors when calculating smaller
sizes.
Hint: note that two consecutive sizes always share one side and only the other one is multiplied or divided by
two, e.g. the short side of Din-A2 is as long as the long side of Din-A3, while the long side of Din-A2 is twice as
long as the short side of Din-A3.

(*created script [paperSizes.groovy] [4]*)

### 4. Palindrome

Create a program with a (recursive) method that takes a String parameter and returns true if the String is a
palindrome and false otherwise. Compare this recursive version with the iterative version you wrote in past weeks.
Which one seems clearer to you?

(*created script [palindrome.groovy] [5]*)

### 5. Power

Create a class with a static method pow that takes to integers (base and exponent) and calculates the power,
e.g. pow(2,3) calculates 23.
Is it easy to do this both iteratively and recursively?

(*created [power.groovy] [6]*)

### 6. Eight Dames (*)

Create a method that calculates the solution to the problem of the eight Dames: "given a chess board, and knowing
that the Dame can reach any tile horizontally, vertically, or diagonally, place 8 Dames on the board so that none
of them can reach the others by doing only one move". You can return the solution as an array of 8x8 booleans
where eight tiles are true (those with the Dames on them) and the others are false.
For extra complexity, make your method return all the possibilities in which the problem can be solved (this
may take a long time).

(*to be implemented*)

### 7. Hanoi Redux (**)

The legend of the Towers of Hanoi has inspired countless variations as mind games. Here is one of them: if we have
three posts and 64 discs, where all the even-numbered discs are on the leftmost post while the odd-numbered discs
are on the rightmost post, how many moves do we need to exchange the discs following the Hanoi rules for disc
movement?
Write a method that calculates the number of moves necessary to exchange *n* discs.

(*to be implemented*)

### 8. How big is your stack? (*)

Write a method that calculates the maximum size of the stack (measured in method calls) by forcing a `StackOverflowError`.
Use different methods, which different number and types of local variables, and see how the number of maximum
function calls changes.

(*created [howBigIsYourStack.groovy] [7]*)

[1]:
[2]:
[3]:
[4]:
[5]:
[6]: