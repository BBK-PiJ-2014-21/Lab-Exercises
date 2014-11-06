// 3. Creating matrices

public class Matrix {
	private int[][] matrix;
	
	public Matrix(int sizeX, int sizeY) {
		matrix = new int[sizeX][sizeY];
		int i=0;
		int j=0;
		if (sizeX>=sizeY) {
			for(; i<sizeX; i++) {
				j=0;
				for (; j<sizeY; j++) {
					matrix[i][j] = 1;
				}
			}
		} else {
			for(; j<sizeY; j++) {
				i=0;
				for (; i<sizeX; i++) {
					matrix[i][j] = 1;
				}
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
		int count = 0;
		String nString = "";
		int i = 1;
		int y = 0;
		char character = 'a';
		int n = 0;
		if (x>=matrix.length) {
			return;
		} else {
			character = s.charAt(0);
			if (!Character.isDigit(character)) {
				return;
			} else {									
				for(; i<s.length(); i++) {
					character = s.charAt(i);
					if (!Character.isDigit(character)) {
						if(character == ',') {
							count++;
						} else {
							return;
						}
					}
					i++;
					character = s.charAt(i);
					if (Character.isDigit(character) == false) {
						return;
					}
				}
				char lastChar = s.charAt(s.length()-1);
				if (Character.isDigit(lastChar) == false) {
					return;
				} else {
					count++;
				}
			}
			if (count!=matrix[x].length) {
				return;
			} else {
				for (i = 0; i<s.length(); i++) {
					character = s.charAt(i);
					if (Character.isDigit(character)) {
						nString = nString + character;
					} else {
						n = Integer.parseInt(nString);
						matrix[x][y] = n;
						nString = "";
					}
				}
				n = Integer.parseInt(nString);
				y = matrix.length-1;
				matrix[x][y] = n;
			}
		}
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