import java.util.ArrayList;
/**
 *
 */
public class Hailstone {
	private ArrayList<Integer> l;
	
	public Hailstone() {
		l = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> hailstoneCalc(int n) {
	//	checkSize();
		l.add(n);
		if(n==1) {
			return l;
		} else {
			l.add(n);
			if(n%2==0) {
				return hailstoneCalc(n/2);
			} else {
				return hailstoneCalc(3*n+1);
			}
		}
	}
	/*
	private void checkSize() {
		if(l[l.size()-1] != -1) {
			l.ensureCapacity(l.size()*2);
		}
	}
	*/
		
	public void printList() {
		for(Integer number : l) {
			System.out.println(number);
		}
	}
	
}
			