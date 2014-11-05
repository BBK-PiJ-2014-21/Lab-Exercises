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
	
}