package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader60 {
    public static void main(String[] args) {
        try {
            // Create BufferedReader using FileReader
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\OneDrive\\Desktop\\Diksha\\dk.txt"));

            String l;

   
            while ((l = br.readLine()) != null) {
                System.out.println(l);
            }

            // Always close the reader
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
