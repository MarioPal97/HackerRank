import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] arrOfStr = s.split(":");
        int hh,mm,ss = 0;
        hh = Integer.parseInt(arrOfStr[0]);
        mm = Integer.parseInt(arrOfStr[1]);
        ss = Integer.parseInt(arrOfStr[2].substring(0,2));
        if(arrOfStr[2].substring(2,4).equals("PM") && hh < 12) { 
            hh = hh + 12;
        } else if (arrOfStr[2].substring(2,4).equals("AM") && hh == 12) {
            hh = 0;
        }
        String  hr = String.valueOf(hh);
        if (hh < 10) {
            hr = "0" + hr;
        }
        String min = String.valueOf(mm);
        if (mm < 10) {
            min = "0" + min;
        }
        String sec = String.valueOf(ss);
        if (ss < 10) {
            sec = "0" + sec;
        }
        String finalTime = (hr + ":" + min + ":" + sec);
        return finalTime;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
