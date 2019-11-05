package files;


import java.io.File;
import java.io.IOException;

// Write a Java program to check if given pathname is a directory or a file.
public class Exercise1 {

    public static void main(String[] args) throws IOException {

        String givenPath = "src/files/test3";
        File file = new File(givenPath);

        System.out.println("File or directory exists: " + file.exists());

        if (file.isDirectory()) {
            System.out.println("Given path is directory!");
        } else if (file.isFile()) {
            System.out.println("Given path is file");
        }

    }


}
