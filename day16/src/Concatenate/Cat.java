import java.io.*;

public class Cat {
	
	public void getFile(String filename) {
		File file = new File("." + File.separator + filename);
		if(!file.exists()) {
			System.out.println("The file does not exist");
		} else {
			readFile(file);
		}
	}
	
	public void readFile(File file) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			while((line = in.readLine())!= null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			closeReader(in);
		}
	}
	
	
	public void closeReader(Reader reader) {
		try {
			if(reader!=null) {
				reader.close();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}	
	
	
}
		