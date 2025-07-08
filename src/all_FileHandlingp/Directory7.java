package all_FileHandlingp;
import java.io.File;

public class Directory7 {
    public static void main(String[] args) {
        File dir = new File("MyFolder");
        if (dir.mkdir()) {
            System.out.println("Directory created: " + dir.getName());
        } else {
            System.out.println("Directory not created.");
        }
    }
}