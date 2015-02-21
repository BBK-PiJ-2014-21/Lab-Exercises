package tempAverages;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class TempCalc {
    
    public void calcAverage(File file) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            List<Integer> average = new ArrayList<>();
            String read = "";
            int lineTotal = 0;
            while((read = in.readLine())!= null) {
                String[] stringLine = read.split("\\s*,\\s*");
                for(String s : stringLine) {
                    try {
                        int n = Integer.parseInt(s);
                        lineTotal += n;
                    } catch (NumberFormatException ex) {
                        System.out.println(s + " cannot be parsed as Integer");
                        ex.printStackTrace();
                        System.exit(1);
                    }
                }
                average.add(lineTotal/stringLine.length);
                lineTotal = 0;
            }
            int total = 0;
            for(int i=0; i<average.size(); i++) {
                System.out.println("Line " + (i+1) + ": " + average.get(i));
                total+=average.get(i);
            }
            System.out.println("=============================");
            System.out.println("Total average: " + total/average.size());
        } catch(FileNotFoundException ex) {
            System.out.println(file + ": file not found.");
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
