package concatenate;

import java.io.*;

public class Cat {
	
	public void getFile(String filename) {
		File file = new File("." + File.separator + filename);
		readFile(file);
	}
	
	private void readFile(File file) {
		BufferedReader in = null;
		try {
            in = new BufferedReader(new FileReader(file));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File " + file + " does not exist");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			closeReader(in);
		}
	}
	
	
	private void closeReader(Reader reader) {
		try {
			if(reader!=null) {
				reader.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}	
	
	
}
		