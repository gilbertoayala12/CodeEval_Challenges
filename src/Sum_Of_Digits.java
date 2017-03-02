
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            int len = line.length();
         int suma=0;

         for (int i = 0; i < line.length(); i++) {
         suma = suma + Character.getNumericValue(line.charAt(i));



        }
         System.out.println(suma);
        }
    }
}
