package sort;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class Sort {
    
    public void sort(String file) {
        File input = new File(file);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(input));
            String read = "";
            List<String> fileToArray = new ArrayList<>();
            while ((read = in.readLine()) != null) {
                fileToArray.add(read);
            }
            Comparator<String> comp = new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            };
            fileToArray.sort(comp);
            for (String s : fileToArray) {
                if (s == null) {
                    return;
                } else {
                    System.out.println(s);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println(input + ": file not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }

}
