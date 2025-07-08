package all_FileHandlingp;
import java.io.File;
import java.io.IOException;

public class Create1 {
    public static void main(String[] args) {
        try {
            File f = new File("example.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}