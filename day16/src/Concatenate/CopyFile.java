import java.io.*;
import java.util.Scanner;

public class CopyFile {
	
	public void readInput(String input, String output) {
		Scanner sc = new Scanner(System.in);
		File inputFile = new File(input);
		File outputFile = new File(output);
		BufferedReader in = null;
		if(!outputFile.exists() || (outputFile.exists() && overWrite())) {
			try {
				in = new BufferedReader(new FileReader(inputFile));
				String line;
				while((line = in.readLine())!=null) {
					System.out.println(line);
				}
			} catch (FileNotFoundException ex) {
				System.out.println("File " + inputFile + " not found.");
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	public boolean overWrite() {
		System.out.println("Would you like to overwrite " + output + "?");
		while(true) {
			System.out.print(">> ");
			String result = sc.next();
			if(result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes")) {
				return true;
			} else if (result.equalsIgnoreCase("n") || result.equalsIgnoreCase("no")) {
				return false;
			} else {
				continue;
			}
		}
	}
		
}