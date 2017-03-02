import java.io.*;
public class Main {
    public static int reversed(int num) {
        int reversed = 0;

        while (num != 0) {
            reversed = reversed * 10;
            reversed = reversed + num % 10;
            num = num / 10;
        }


        return reversed;
    }

    public static boolean isPalindrome(int num) {
        if (num == reversed(num)) {
            return true;
        } else {
            return false;

        }


    }
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int num = Integer.parseInt(line);
            int reversed = reversed(num);
            int suma=0,cont=0;
            while (true) {
            suma = num + reversed;
            cont++;
            if (isPalindrome(suma)) {
                System.out.println(cont + " " + suma);
                break;
            } else {
                num= suma;
                reversed = reversed(suma);

            }


            }
        }
    }
}
