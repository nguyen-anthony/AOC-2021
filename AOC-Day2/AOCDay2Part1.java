import java.io.*;
import java.util.*;
public class AOCDay2Part1 {
    public static void main(String args[]) throws FileNotFoundException {
        int position = 0;
        int depth = 0;
        ArrayList<String> lines = new ArrayList<String>();
        Scanner scanner = new Scanner(new File("d02.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lines.add(line);
        }

        for (int i = 0; i < lines.size(); i++) {
            String[] current = lines.get(i).split(" ");
            String direction = current[0];
            int distance = Integer.parseInt(current[1]);

            if (direction.startsWith("for")) {
                position += distance;
            } else if (direction.startsWith("up")) {
                depth -= distance;
            } else {
                depth += distance;
            }
        }
        System.out.println("Horizontal Position is " + position);
        System.out.println("Depth is " + depth);
        System.out.println("hPos * depth is " + (position * depth));
    }
}
