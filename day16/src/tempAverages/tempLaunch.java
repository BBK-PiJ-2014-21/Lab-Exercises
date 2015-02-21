package tempAverages;

import java.io.File;
import java.util.Scanner;

/**
 *
 */
public class tempLaunch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tempCalc c = new tempCalc();
        System.out.println("Please enter the name or path to the CSV file");
        String s = sc.next();
        File file = new File(s);
        c.calcAverage(file);
    }
    
}
