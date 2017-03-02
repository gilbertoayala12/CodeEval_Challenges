import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] array = line.split(" ");
            Double num1 = Double.parseDouble(array[0]);
            Double num2 = Double.parseDouble(array[1]);
            Double num3 = Double.parseDouble(array[2]);
            for (int i = 1; i <= num3; i++) {
                if (i % num1 == 0.0 && i % num2 == 0.0) {
                    System.out.print("FB ");

                } else {
                    if (i % num1 == 0.0) {
                        System.out.print("F ");

                    } else {
                        if (i % num2 == 0.0) {
                            System.out.print("B ");
                        }else{
                            System.out.print(i+ " ");
                        }

                    }


                }



            }
            System.out.println("");

        }
    }
}
