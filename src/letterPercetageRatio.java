import java.text.DecimalFormat;
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        DecimalFormat decF = new DecimalFormat("0.00");
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
             double cantUpper = 0, cantLower = 0, totalL = 0, totalU = 0;
            for (int i = 0; i < line.length(); i++) {
                if ((int) line.charAt(i) > 96) {
                    cantLower++;
                } else {
                    cantUpper++;
                }

            }
            totalL = ((cantLower / line.length()) * 100);
            totalU = ((cantUpper / line.length()) * 100);
           
            
            
            System.out.println("lowercase: " + (decF.format(totalL)) + " " + "uppercase: " + decF.format(totalU));
        }
    }
}
