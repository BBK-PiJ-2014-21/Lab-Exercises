## 3. Yet another loop

```
What does the following piece of code do?
	String str = System.console().readLine()
	int i = Integer.parseInt(str)
	while (i < 10) {
		i++;
		str = System.console().readLine()
		int j = Integer.parseInt(str)
		if (j == 0) {
			break;
		} else if (j != 1) {
			println j;
		}
	}
	println "finished"

Hint: the reserved word break exits the current loop.
```
	
This piece of code will take a number `n` as input: if this is larger or equal to `10`,
it will print `finished`; otherwise it will ask for *10-n* times for another number as input:
if this is equal to 0 it will stop the loop and print `finished`;
otherwise it will print the new number (unless this is equal to `1`) until the *10-n*th time,
after that it will go out of the loop and print `finished`.