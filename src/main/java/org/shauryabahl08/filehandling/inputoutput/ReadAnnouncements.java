package org.shauryabahl08.filehandling.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAnnouncements {

    public static void main(String[] args) {
        // user input
        // Scanner scanner = new Scanner(System.in);

        // file input
        // pathname: location of the file you want to read
        // /Users/mohitsingh/Downloads/java-learning-may-shauryabahl08/src/main/java/org/shauryabahl08/oops/class_and_object/learning.txt
        File file = new File("src/main/java/org/shauryabahl08/filehandling/inputoutput/announcements.txt");
        // Because java enforce to handle exceptions
        // try is the block of code where we write the code that can throw an exception
        try {
            Scanner scanner = new Scanner(file);
            // hasNextLine() method will return true if there is a next line in the file
            // nextLine() method will return the next line in the file

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // processing the line
                System.out.println(line);
            }


            System.out.println("Reading announcements from file");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
    }
}
