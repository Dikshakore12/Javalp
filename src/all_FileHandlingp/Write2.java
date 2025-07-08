package all_FileHandlingp;
import java.io.FileWriter;
import java.io.IOException;

public class Write2 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt");
            fw.write("Hello, this is Java file handling!");
            fw.close();
            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}