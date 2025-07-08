package all_FileHandlingp;
import java.io.File;

public class List8 {
    public static void main(String[] args) {
        File dir = new File("C:\\Your\\Path\\Here"); // replace with an existing path
        String[] files = dir.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory does not exist or is empty.");
        }
    }
}