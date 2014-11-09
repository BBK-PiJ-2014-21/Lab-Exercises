// 6. - Anti-Aircraft Aim

public class Target {
	private int[][][] matrix;
	
	public Target(int n) {
		matrix = new int[n][n][n];
	}
	
	public void init() {
		for(int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix.length; j++) {
				for(int k=0; k<matrix.length; k++) {
					matrix[i][j][k] = 0;
				}
			}
		}
		
		/* get a random position for each axis:
		this should work with uneven axis as well,
		the constructor set same value per axis anyway.
		*/ 
		
		int randomX = (int) Math.abs(matrix.length * Math.random());
		int randomY = (int) Math.abs(matrix[0].length * Math.random());
		int randomZ = (int) Math.abs(matrix[0][0].length * Math.random());
		matrix[randomX][randomY][randomZ] = 1;
		System.out.println(randomX + " " + randomY + " " + randomZ);
		
	}
				
	public Result fire(int x, int y, int z) {
		int i=0;
		int j=0;
		int k=0;
		if (isOutOfRange(x) || isOutOfRange(y) || isOutOfRange(z)) {
			return Result.OUT_OF_RANGE;
		} else {
			OUTER:
			for(i=0; i<matrix.length; i++) {
				for (j=0; j<matrix.length; j++) {
					for(k=0; k<matrix.length; k++) {
						if (matrix[i][j][k] == 1) {
							break OUTER;
						}	
					}
				}
			}
		}
		// I gave the enum values considering the axis as a cartesian system:
		// a low value of x means a shot towards the left
		// a low value of y means a shot below
		// a low the value of z means a short one
		if (matrix[x][y][z] == matrix[i][j][k]) {
			return Result.HIT;
		} else if(x!=i) {
			if (x>i) {
				return Result.FAIL_RIGHT;
			} else {
				return Result.FAIL_LEFT;
			}
		} else if(y!=j) {
			if(y>j) {
				return Result.FAIL_HIGH;
			} else {
				return Result.FAIL_LOW;
			}
		} else {
			if(z>k) {
				return Result.FAIL_LONG;
			} else {
				return Result.FAIL_SHORT;
			}
		}
	}	
		
	private boolean isOutOfRange(int n) {
		if (n<0 || n>matrix.length-1) {
			return true;
		} else {
			return false;
		}
	}

}
