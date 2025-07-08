package all_FileHandlingp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read3 {
    public static void main(String[] args) {
        try {
            File f = new File("example.txt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}