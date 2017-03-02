import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
          line = line.trim();
          String array [] = line.split(",");
          String primer = array[0];
          String volteada = new StringBuffer(primer).reverse().toString();
          String letra = array[1];
          int num=0;

          num = volteada.indexOf(letra, 0);

            if (volteada.indexOf(letra, 0)==-1) {
            System.out.println(-1);
            }else{
            System.out.println(primer.length() -1 - num);
            }
        }
    }
}
