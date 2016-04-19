import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String text[] = line.split(", ");
            String part1 = text[0];
            String part2 = text[1];
            char[] array = text[1].toCharArray();
            for (char c : array) {
                part1 = part1.replace("" + c, "");
            }
            System.out.println(part1);

        }
    }
}
