import java.io.*;
public class Main {
    public static boolean isPrime(int x){
        if(x == 1 ){
            return false;
        }else{
            for(int i=2; i < x; i++){
                if(x%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String linea="";
            double num = Double.parseDouble(line);
            for (int i = 2; i <num; i++) {
            if (isPrime(i)){
                linea+= i +",";
            }
        }
        linea = linea.replaceAll(",$","");
        System.out.println(linea);
            // Process line of input Here
        }
    }
}
