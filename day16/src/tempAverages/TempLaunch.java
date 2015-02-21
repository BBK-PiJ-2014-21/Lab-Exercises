package tempAverages;

import java.io.File;
import java.util.Scanner;

/**
 *
 */
public class TempLaunch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TempCalc c = new TempCalc();
        System.out.println("Please enter the name or path to the CSV file");
        String s = sc.next();
        File file = new File(s);
        c.calcAverage(file);
    }
    
}
