package listDir;

import java.io.*;

/**
 *
 */
public class ListCurrentDirectory {

    public static void main(String[] args) {
		File currentDir = new File(".");
		String[] result = currentDir.list();
        for(String file : result) {
            System.out.print(file + " ");
        }

    }

}
