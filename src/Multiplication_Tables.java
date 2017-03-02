
import java.io.*;
public class Main {
    public static void main (String[] args)  {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j==1){
                    System.out.printf("%2d",i * j);
                }else{
                    System.out.printf("%4d", i * j);
                }

            }
            if (i!=12){
                System.out.println();
            }else{

            }

        }
    }
}
