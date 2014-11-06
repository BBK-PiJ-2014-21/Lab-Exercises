// 3. Creating matrices - test

Matrix m1 = new Matrix(2,2);
m1.prettyPrint();				// should print all 1s
System.out.println();
System.out.println(m1.toString());
m1.setRow(0, "2,8,5");			// as before (needs 2 parameters not 3)
m1.prettyPrint();
System.out.println();	
m1.setRow(1, "0,9");			// should print 0, 9 on first row
m1.prettyPrint();
System.out.println();
m1.setRow(0, "888,77");			// should print 888, 77 on zeroeth row
m1.prettyPrint();
System.out.println();
m1.setRow(0, "6,6,");			// as before (input error)
m1.prettyPrint();
System.out.println();
m1.setRow(0, "6,,,");			// as before (input error)
m1.prettyPrint();
System.out.println(m1.toString());

m1.setElement(0,0,999) 
m1.prettyPrint();
System.out.println();			// 888 should change to 999
		
System.out.println();
	
Matrix m2 = new Matrix(3,4);
m2.prettyPrint();				// should print all 1s
System.out.println();	
System.out.println(m1.toString());
m2.setColumn(2, "2,44,555,6666");		// as before (needs 3 parameters not 4)
m2.prettyPrint();
System.out.println();
m2.setColumn(1, "0a,2");				// as before (input error)
m2.prettyPrint();
System.out.println();
m2.setColumn(3, "333,33,3");			// should print 333, 33, 3 on third column
m2.prettyPrint();
System.out.println();
m2.setColumn(3, "3,3,3,3");				// as before (needs 3 parameter not 4)
m2.prettyPrint();
System.out.println();
System.out.println(m2.toString());

m2.setElement(0,3,222);	
m2.prettyPrint();
System.out.println();		// 333 should change to 222
