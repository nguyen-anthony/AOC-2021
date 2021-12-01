import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AOCDay1Part2 {
    public static void main(String args[]) throws IOException {
        int countIncrease = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            int firstLine = Integer.valueOf(br.readLine());
            int secondLine = Integer.valueOf(br.readLine());
            int thirdLine = Integer.valueOf(br.readLine());
            String nextLine = br.readLine();

            while(nextLine != null) {

                int firstSum = firstLine + secondLine + thirdLine;
                int secondSum = firstSum - firstLine + Integer.valueOf(nextLine);

                if(firstSum < secondSum)
                    countIncrease++;

                firstLine = secondLine;
                secondLine = thirdLine;
                thirdLine = Integer.valueOf(nextLine);
                nextLine = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(countIncrease);
    }
}
