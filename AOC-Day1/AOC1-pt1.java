import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AOC1 {

    public static void main(String args[]) throws IOException {
        int countIncrease = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String previousLine = br.readLine();
            String contentLine = br.readLine();
            while(contentLine != null) {
                if(Integer.valueOf(previousLine) < Integer.valueOf(contentLine)){
                    countIncrease++;
                }
                previousLine = contentLine;
                contentLine = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(countIncrease);
    }
}
