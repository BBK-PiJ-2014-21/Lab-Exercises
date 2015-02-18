package concatenate;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
	
	public void readInput(String input, String output) {
		Scanner sc = new Scanner(System.in);
		File inputFile = new File(input);
		File outputFile = new File(output);
		BufferedReader in = null;
        PrintWriter out = null;
		if(!outputFile.exists() || (outputFile.exists() && overWrite(outputFile))) {
			try {
				in = new BufferedReader(new FileReader(inputFile));
				String line;
				out = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)));
			} catch (FileNotFoundException ex) {
				System.out.println("File " + inputFile + " not found.");
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	private boolean overWrite(File file) {
		System.out.println("Would you like to overwrite " + file + "?");
        Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(">> ");
			String result = sc.nextLine();
			if(result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes")) {
				return true;
			} else if (result.equalsIgnoreCase("n") || result.equalsIgnoreCas e("no")) {
                return false;
            }
		}
	}
    
    private void writeToFile(File output) {
        try {
            PrintWriter out = new PrintWriter(output);
            
        }
        
    }
		
}