// 3. Creating matrices - Tester

public class Matrix_tester {
	public static void main(String[] args) {
		Matrix m1 = new Matrix(2,2);
		m1.prettyPrint();
		System.out.println();
		m1.setRow(0, "2,4,5");
		m1.prettyPrint();
		System.out.println();
		m1.setRow(1, "0,9");
		m1.prettyPrint();
		System.out.println();
		m1.setRow(0, "888,77");
		m1.prettyPrint();
		System.out.println();
		m1.setRow(0, "6,6,");
		m1.prettyPrint();
		System.out.println();
		m1.setRow(0, "6,6,");
		m1.prettyPrint();
		
		System.out.println();
		
		Matrix m2 = new Matrix(3,4);
		m2.prettyPrint();
		System.out.println();
		m2.setRow(4, "2,4,5");
		m2.prettyPrint();
		System.out.println();
		m2.setRow(1, "0a,2");
		m2.prettyPrint();
		System.out.println();
		m2.setRow(3, "3,3,3");
		m2.prettyPrint();
		System.out.println();
		
	}
}

/* output:

1	1		initial state (constructor seems ok)
1	1

1	1		setRow() ignored as 3 columns in parameter (2 required)
1	1

1	1		values ok
0	9

888	77		values ok
0	9

888	77		setRow() ignored for the "," at the end of the parameter declaration
0	9

1	1	1	1		in all four cases: first costructor ok, then:
1	1	1	1		setRow(4) when maximum is 3
1	1	1	1		incorrect letter "a" in parameters area
					only 3 values declared (needs 4)
					
*/







