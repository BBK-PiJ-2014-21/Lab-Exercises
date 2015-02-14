package hailstoneNumbers;

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
        if(n<1) {
            return null;
        }
		l.add(n);
		if(n==1) {
			return l;
		} else {
			if(n%2==0) {
				return hailstoneCalc(n/2);
			} else {
				return hailstoneCalc(3*n+1);
			}
		}
	}

	public void printList() {
		for(Integer number : l) {
			System.out.println(number);
		}
	}
	
}
			