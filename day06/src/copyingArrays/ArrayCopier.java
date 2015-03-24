package copyingArrays;

public class ArrayCopier {
	
	public void copy(int[] src, int[] dst) {
		int i = 0;
		int j = 0;
		for (; i<=src.length-1; i++) {
			if (j == dst.length) {
				break;
			}
			dst[j] = src[i];
			j++;
		}
		while(j<dst.length) {
			dst[j] = 0;
			j++;
		}
	}
}