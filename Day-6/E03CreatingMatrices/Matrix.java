// 3. Creating matrices

// should find some method to replace inelegant for-ifs code 
//	for setRow and setColumn (some digits-symbols parser for Strings)
// also need to fix toString() method (it prints the memory address)
// StringBuffer() seems to be a good solution

import java.util.Arrays;

public class Matrix {
	private int[][] matrix;
	
	public Matrix(int sizeX, int sizeY) {
		matrix = new int[sizeX][sizeY];
		for(int i=0; i<sizeX; i++) {
			for (int j=0; j<sizeY; j++) {
				matrix[i][j] = 1;
			}
		}
	}	
			
	public void setElement(int x, int y, int newValue) {
			if (x<matrix.length) {
				if (y<matrix[x].length) {
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
		for (int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				s = s + Arrays.toString(matrix[i][j]);
				s= s + ',';
			}
			s = s + ';';
		}
		return s.substring(0,s.length()-1);
	}			
	
	public void prettyPrint() {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
	
}