package uniq;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: ignore whitespaces?
 */
public class Uniq {
    
    public void uniq(String file) {
        File input = new File(file);
        BufferedReader in = null;
        try {
            String read = "";
            List<String> fileToArray = new ArrayList<>();
            in = new BufferedReader(new FileReader(input));
            boolean dup = false;
            ext: while((read = in.readLine())!= null) {
                for(int i=0; i<fileToArray.size(); i++) {
                    if(read.equals(fileToArray.get(i))) {
                        continue ext;
                    }
                }
                fileToArray.add(read);
            }
            for(String s : fileToArray) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(input + ": file not found.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
