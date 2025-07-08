package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;

 class FileOutputExample57 {
    public static void main(String[] args) {
        try {
            // Create FileOutputStream object
            FileOutputStream fout = new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Diksha\\output.txt");

            // Text to write into the file
            String data = "Hello, this is written using FileOutputStream in Java.";

            // Convert string into bytes
            byte[] bytes = data.getBytes();

            // Write bytes to file
            fout.write(bytes);

            // Close the stream
            fout.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
