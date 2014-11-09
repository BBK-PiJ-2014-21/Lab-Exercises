// 3. Creating matrices - test

// testing constructor, prettyPrint(), toString(), setRow()
	Matrix m1 = new Matrix(2,2);
	System.out.println("\nnew Matrix(2,2), testing constructor and prettyPrint()");
	m1.prettyPrint();
	System.out.println();
	m1.setRow(0, "0,9");
	System.out.println("testing setRow(0, \"0,9\")");
	m1.prettyPrint();
	System.out.println();
	m1.setRow(1, "8,5");
	System.out.println("testing setRow(1, \"8,5\")");
	m1.prettyPrint();
	System.out.println();
	m1.setElement(0,0,1);
	System.out.println("testing setElement(0,0,1)");
	m1.prettyPrint();
	System.out.println("testing toString()");
	System.out.println(m1.toString());
	System.out.println();
	m1.setRow(0, "2,8,5");
	System.out.println("testing error setRow(0, \"2,8,5\") // two parameters needed");
	m1.prettyPrint();
	System.out.println();
	m1.setRow(0, "6,6");
	System.out.println("testing setRow(0, \"6,6\")");
	m1.prettyPrint();
	System.out.println();
	m1.setRow(1, "6,,,");
	System.out.println("testing error setRow(1, \"6,,,\") // invalid input");
	m1.prettyPrint();
	
// testing constructor, setColumn(), setElement(), toString()
	Matrix m2 = new Matrix(3,4);
	System.out.println("\nnew Matrix(3,4)");		
	m2.prettyPrint();
	System.out.println();
	m2.setColumn(2, "0,11,22,33");
	System.out.print("testing error setColumn(2, \"0,11,22,33\")");
	System.out.println("// three parameters needed");
	m2.prettyPrint();
	System.out.println();
	m2.setColumn(3, "333,33,3");
	System.out.println("testing setColumn(3, \"333,33,3\")");
	m2.prettyPrint();
	m2.setElement(3,3,333);
	System.out.println("testing error setElement(3,3,333) // max row index is 2");
	m2.prettyPrint();
	m2.setElement(2,3,333);
	System.out.println("testing setElement(2,3,333)");
	m2.prettyPrint();
	System.out.println("\ntesting toString()");
	System.out.println(m2.toString());
	System.out.println();
	m2.setColumn(1, "0a,2");
	System.out.println("testing error setColumn(1, \"0a,2\") // invalid input");
	m2.prettyPrint();
	System.out.println();
		
// testing setMatrix and isSymmetrical - 2D array
	Matrix m3 = new Matrix(3,3);
	m3.setMatrix("0,1,2;1;2;2,2,0");
	System.out.println("new matrix(3,3)");
	System.out.println("test error setMatrix(\"0,1,2;1;2;2,2,0\") // should ignore it");	// KIND OF FAILED 
	m3.prettyPrint();
	System.out.println();
	m3.setMatrix("0,1,2;1,0,2;2,2,0");	// FAILED ----------------------------------
	System.out.println("test setMatrix(\"0,1,2;1,0,2;2,2,0\")");
	m3.prettyPrint();
	System.out.println("\ntesting isSymmetrical // should print 'true'");
	System.out.println(m3.isSymmetrical());
	m3.setMatrix("1,1,1;2,2,2;3,3,3");
	System.out.println("test setMatrix(\"1,1,1;2,2,2;3,3,3\")");
	m3.prettyPrint();
	System.out.println("\ntesting isSymmetrical // should print 'false'");
	System.out.println(m3.isSymmetrical());
	System.out.println();
		
/* testing setMatrix and isTriangular
	int[][] triangular1 = {{1,1,1},{0,1,1},{0,0,1}};
	int[][] triangular2 = {{0,0,0},{0,0,0},{0,0,0}};
	int[][] notTriangular1 = {{1,2,3},{1,2,3},{1,2,3}};
	int[][] notTriangular2 = {{0,1,2,4},{1,2,4,3},{0,0,0,0}};
	System.out.println(m.isTriangular(triangular1));	// should print 'true';
	System.out.println(m.isTriangular(triangular2));	// should print 'true';
	System.out.println(m.isTriangular(notTriangular1));	// should print 'false';	
	System.out.println(m.isTriangular(notTriangular2));	// should print 'false';
*/		
// testing 1D array methods - constructor, setElement(), isSymmetrical()
	Matrix array = new Matrix(3);
	System.out.println("testing new Matrix[3] - 1D array constructor and prettyPrint()");
	array.prettyPrint1D();
	System.out.println("testing isSymmetrical1D() // should print 'true'");
	System.out.println(array.isSymmetrical1D());
	array.setElement(2, 0);
	System.out.println("testing setElement(2,0)");
	array.prettyPrint1D();
	System.out.println("testing isSymmetrical1D() // should print 'false'");
	System.out.println(array.isSymmetrical1D());
	System.out.println();
	
