package all_FileHandlingp;
import java.io.FileWriter;
import java.io.IOException;

public class Append4 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt", true);
            fw.write("\nAppended line.");
            fw.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}