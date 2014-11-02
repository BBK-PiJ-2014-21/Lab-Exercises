## 1 Recursive code, line by line

### a)

What number would the following method print on screen if you called `printNumber(6)`?

*NOTE*: `printLine()` method has been swapped to `println()` as the former is not accepted.

<pre>
<i>1</i> 	void printNumbers(int n) {
<i>2</i>		if (n<=0) {
<i>3</i>                        return;
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
			<b>returns</b>;
			call method printNumbers(1) [line 7]
				<b>printNumbers(1)</b>
					<i>output 1</i> [line 5]
					call method printNumbers(-1) [line 6]
						printNumbers(-1) returns;
					call method printNumbers(-2) [line 7]
						printNumbers(-2) returns;
					<i>output 1</i> [line 8]
				<b>returns</b>;
			<i>output 4</i> [line 8]
		<b>returns</b>;
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
				<b>returns</b>;
			call method printNumbers(0) [line 7]
				printNumbers(0) returns;
			<i>output 3</i> [line 8]
		<b>returns</b>;
	<i>output 6</i> [line 8]
<b>returns</b>;
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
