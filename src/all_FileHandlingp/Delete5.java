package all_FileHandlingp;
import java.io.File;

public class Delete5 {
    public static void main(String[] args) {
        File f = new File("example.txt");
        if (f.delete()) {
            System.out.println("Deleted the file: " + f.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}