package makeDir;

import java.io.*;

public class Mkd {
	
	public static void main(String[] args) {
		for(int i=0; i<args.length; i++) {
			File mkd = new File(args[i]);
			mkd.mkdir();
		}
	}
	
}
		