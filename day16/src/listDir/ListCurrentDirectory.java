package listDir;

import java.io.*;

/**
 *
 */
public class ListCurrentDirectory {

    public static void main(String[] args) {
		File currentDir = new File(".");
		String[] result = currentDir.list();
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

}
