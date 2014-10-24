## 2. Ende Homage

	Is there anything wrong with the following piece of code (hint: yes)? What does it do?

		int i = 10
		while (i < 5) {
			i++;
		println i
		}
	
This piece of code will **not** execute anything. It will just assign the value `10` to the variable `int`;
being `10` greater than `5` the while loop will never start.