// 5. Symmetry looks pretty
// could be enhanced to handle uneven arrays

import java.util.Arrays;

public class MatrixChecker {
	
	public boolean isSymmetrical(int[] m) {
		if (m.length <= 1) {
			return true;
		}
		if (m[0] == m[m.length-1]) {
			return isSymmetrical(Arrays.copyOfRange(m, 1, m.length-1));
		}
		return false;
	}
		
	public boolean isSymmetrical(int[][] m) {
		for(int x=0; x<m.length; x++) {
			for(int y=0; y<m[x].length; y++) {
				if(m[x][y] != m[y][x]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean isTriangular(int[][] m) {
		for (int x=0; x<m.length; x++) {
			for (int y=0; y<m[x].length; y++) {
				if(x>y) {
					if(m[x][y] != 0) {
						return false;
					}
				}
			}
		}
		return true;
	}

}
