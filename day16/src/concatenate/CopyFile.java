package concatenate;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
	
	public void copyToFile(String input, String output) {   // (a)
		File inputFile = new File(input);
		File outputFile = new File(output);
		BufferedReader in = null;
        PrintWriter out = null;
		if(!outputFile.exists() || (outputFile.exists() && overWrite(outputFile))) {
			try {
				in = new BufferedReader(new FileReader(inputFile));
                try {
                    out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
                    String line = "";
                    while((line = in.readLine())!=null) {
                        out.println(line);
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println(outputFile + ": file cannot be created or modified.");
                }
			} catch (FileNotFoundException ex) {
				System.out.println(inputFile + ": file not found.");
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
                if(out!=null) {
                    out.close();
                }
                if(in!=null) {
                    try {
                        in.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
		}
	}

    private boolean overWrite(File file) {
        System.out.print("Would you like to overwrite " + file + "?");
        Scanner sc = new Scanner(System.in);
        while(true) {
            String result = sc.nextLine();
            if(result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes")) {
                return true;
            } else if (result.equalsIgnoreCase("n") || result.equalsIgnoreCase("no")) {
                return false;
            }
        }
    }
    
    public void copyToDirectory(String[] inputs, String destination) {  // (b) (*)
        File dest = new File(destination);
        if(!dest.isDirectory()) {
            System.out.println("Destination " + dest + " is not a directory");
        } else {
            for (String input : inputs) {
                copyToFile(input, dest + File.separator + input);
            }
        }
    }
	
		
}