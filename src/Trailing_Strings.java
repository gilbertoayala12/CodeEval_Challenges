import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);//change args[0] to the path of the file you're reading :d
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String lista[]= line.split(",");
            
            if (lista[0].endsWith(lista[1])) {
                System.out.println("1");
                
            }else{
                System.out.println("0");
            }
            
        }
    }
}
