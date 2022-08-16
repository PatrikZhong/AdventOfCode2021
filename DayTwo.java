import java.util.*;
import java.io.*;

public class DayTwo {

    static int HORIZONTAL = 0;
    static int DEPTH = 0;

    public static void handleData(String[] data) {
        String direction = data[0];
        int value = Integer.parseInt(data[1]);

        switch (direction) {
            case "forward":
                HORIZONTAL = HORIZONTAL + value;
                break;
            case "down":
                DEPTH = DEPTH + value;
                break;

            case "up":
                DEPTH = DEPTH - value;
                break;

            default:
                break;
        }

    }

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("data2.txt");
        System.out.println("file read");
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            String[] splitter = line.split(" ");
            handleData(splitter);
        }

        System.out.println(HORIZONTAL * DEPTH);

    }
}
