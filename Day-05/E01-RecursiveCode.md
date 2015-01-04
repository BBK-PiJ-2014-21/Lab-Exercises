## 1 Recursive code, line by line

### a)

What number would the following method print on screen if you called `printNumber(6)`?

*NOTE*: `printLine()` method has been swapped to `println()` as the former is not accepted in Groovy.

<pre>
<i>1</i> 	void printNumbers(int n) {
<i>2</i>		if (n [is less or equal to] 0) {
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


### b)

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


### c)

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

### d) McCarthy's 91 function

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


