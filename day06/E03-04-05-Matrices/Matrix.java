/* 3. Creating matrices

	should find some method to replace inelegant and long for-ifs code 
	for setRow() and setColumn() (some parser for Strings)

*/

import java.util.Arrays;

public class Matrix {
	private int[][] matrix;
	private int[] array; 	// field added to test MatrixChecker.isSymmetrical(int[])
	
	public Matrix(int sizeX, int sizeY) {
		matrix = new int[sizeX][sizeY];
		for(int i=0; i<sizeX; i++) {
			for (int j=0; j<sizeY; j++) {
				matrix[i][j] = 1;
			}
		}
	}
			
	public void setElement(int x, int y, int newValue) {
			if(x<matrix.length && x>=0) {
				if(y<matrix[x].length && y>=0) {
					matrix[x][y] = newValue;
				}
			}			
	}
	
	public void setRow(int x, String s) {
		int count = 0;			// count to match number of columns
		String nString = "";	// will be assigned to each new array value
		int n = 0;				// will be nString parsed to int
		char character = 'a';	// initialized at random value, will check char '0' to '9'
		int i = 1;				// will check position of variable character
		int y = 0;				// represent the columns of array
		if (x>=matrix.length) {
			return;
		} else {
			character = s.charAt(0);
			if (!Character.isDigit(character)) {
				return;
			} else {									
				for(; i<s.length(); i++) {
					character = s.charAt(i);
					if (Character.isDigit(character)) {
						continue;
					} else if (character == ',') {
						count++;
					} else {
						return;
					}
				}
				if (Character.isDigit(character)) {
					count++;
				} else {
					return;
				}
			}
		}
		if(count != matrix[x].length) {
			return;
		} else {
			for (i=0; i<s.length(); i++) {
				character = s.charAt(i);
				if (Character.isDigit(character)) {
					nString = nString + character;
				} else {
					n = Integer.parseInt(nString);
					matrix[x][y] = n;
					nString = "";
					y++;
				}
			}
			n = Integer.parseInt(nString);
			matrix[x][y] = n;
		}
	}
	
		public void setColumn(int y, String s) {
		int count = 0;			// count to match number of columns
		String nString = "";	// will be assigned to each new array value
		int n = 0;				// will be nString parsed to int
		char character = 'a';	// initialized at random value, will check char '0' to '9'
		int i = 1;				// will check position of variable character
		int x = 0;				// represent the rows of array
		if (y>=matrix[0].length) {
			return;
		} else {
			character = s.charAt(0);
			if (!Character.isDigit(character)) {
				return;
			} else {									
				for(; i<s.length(); i++) {
					character = s.charAt(i);
					if (Character.isDigit(character)) {
						continue;
					} else if (character == ',') {
						count++;
					} else {
						return;
					}
				}
				if (Character.isDigit(character)) {
					count++;
				} else {
					return;
				}
			}
		}
		if(count != matrix.length) {
			return;
		} else {
			for (i=0; i<s.length(); i++) {
				character = s.charAt(i);
				if (Character.isDigit(character)) {
					nString = nString + character;
				} else {
					n = Integer.parseInt(nString);
					matrix[x][y] = n;
					nString = "";
					x++;
				}
			}
			n = Integer.parseInt(nString);
			matrix[x][y] = n;
		}
	}
	
	public String toString() {
		String s = "[";
		String value = "";
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				value = "" + matrix[i][j]; 
				s = s + value + ',';
			}
			s = s.substring(0, s.length()-1);
			s = s + ';';
		}
		s = s.substring(0,s.length()-1);
		s = s + "]";
		return s;
	}			
	
	public void prettyPrint() {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
/* 4. One-liners for matrices(*)
		this piece of code will start setting the elements
		and stop at the row where some input is wrong,
		should probably be rewritten to discard changes
		for all the rows as soon as it finds an input error
		(see line 65 of Matrix_test.groovy)
*/
	
	public void setMatrix(String s) {
		int countX = 0;
		if(!Character.isDigit(s.charAt(0))) {
			return;
		}
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ';') {
				setRow(countX, s.substring(0,i));
				countX++;
				s = s.substring(i+1);
				i=0;
			}
		}
		setRow(countX,s);
	}
	
// 5. Symmetry looks pretty (new methods to test MatrixChecker class)
	
	public Matrix(int sizeX) {
		array = new int[sizeX];
		for(int i=0; i<array.length; i++) {
			array[i] = 1;
		}
	}
	
	public void setElement(int x, int newValue) {
		if(x<array.length && x>=0) {
			array[x] = newValue;
		}
	}
	
	public void prettyPrint1D() {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}	
	
	public boolean isSymmetrical1D() {
		MatrixChecker m = new MatrixChecker();
		return m.isSymmetrical(array);
	}	
	
	public boolean isSymmetrical() {
		MatrixChecker m = new MatrixChecker();
		return m.isSymmetrical(matrix);
	}
	
	public boolean isTriangular() {
		MatrixChecker m = new MatrixChecker();
		return m.isTriangular(matrix);
	}
		
}