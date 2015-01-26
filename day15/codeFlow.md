
### 1. Code flow

    * userInput is 0.
		1{2-8};		[1, 2, 3, 4, 5, 6]
		9{10-11;	[2, 3, 4, 5, 6] get(0) = 2
		12-13;		[3, 4, 5, 6] get(0) = 3
		14-15;		[4, 5, 6] get(0) = 4
		16-17;		[5, 6] get(0) = 5
		18-19;		[6] get(0) = 6
		20-21*		[] get(0) = EX THROWN
		}24-25		Exception in thread "launch" java.lang.IndexOutOfBoundsException... 
		26-27}
		
		OUTPUT:
		2
		3
		4
		5
		
	* userInput is 2.
		1{2-8};		[1, 2, 3, 4, 5, 6]
		9{10-11;	[2, 3, 4, 5, 6] get(2) = 4
		12-13;		[3, 4, 5, 6] get(2) = 5
		14-15;		[4, 5, 6] get(2) = 6
		16-17*		[5, 6] get(2) = EX THROWN
		}24-25		Exception in thread "launch" java.lang.IndexOutOfBoundsException... 
		26-27}
		
		OUTPUT:
		4
		5
		6
		
	* userInput is 4.
	
		1{2-8};		[1, 2, 3, 4, 5, 6]
		9{10-11; 	[2, 3, 4, 5, 6] get(4) = 6
		12-13;		[3, 4, 5, 6] get(4) = EX THROWN
		}24-25		Exception in thread "launch" java.lang.IndexOutOfBoundsException... 
		26-27}
		
		OUTPUT:
		6
		
	* userInput is 6.
	
		1{2-8};		[1, 2, 3, 4, 5, 6]
		9{10-11;	[2, 3, 4, 5, 6] get(6) = EX THROWN
		}24-25		Exception in thread "launch" java.lang.IndexOutOfBoundsException... 
		26-27}
		
		OUTPUT: *empty*
		