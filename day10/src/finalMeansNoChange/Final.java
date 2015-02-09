package finalMeansNoChange;

/* 7. finalMeansNoChange.Final means no change
 Compilation error: cannot inherit from final java.lang.String
 (cannot extends final classes, as they are immutable!)

public class Final extends String {

	public Final(String s) {
		super(s);
	}
	
	public void printEven() {
		int i = 0;
		int l = this.length()-1;
		while(l>=0) {
			System.out.println(this.charAt(i));
			i = i+2;
			l = l-2;
		}
	}

}

*/