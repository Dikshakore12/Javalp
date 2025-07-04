package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter56 {
    public static void main(String[] args) {
        try {
            // Create BufferedWriter using FileWriter
            BufferedWriter b = new BufferedWriter(new FileWriter("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Diksha\\dk.txt"));

           
            b.write("Hello, this is a test file written using BufferedWriter.");
            b.newLine();
            b.write("This is the second line.");

            // Always close the writer
            b.close();

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
