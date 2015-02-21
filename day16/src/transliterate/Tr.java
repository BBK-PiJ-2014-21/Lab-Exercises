package transliterate;

import java.io.*;

/**
 * TODO use a StreamTokenizer to properly parse the file, e.g. in order to swap words of String with punctuation appended
 */
public class Tr {
    
    public void tr (String fileName, String oldString, String newString) {
        File file = new File(fileName);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String read = "";
            while ((read = in.readLine()) != null) {
                String[] line = read.split("\\s");
                for (String s : line) {
                    if (s.equalsIgnoreCase(oldString)) {
                         System.out.print(newString + " ");
                    } else {
                        System.out.print(s + " ");
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(file + ": file not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
