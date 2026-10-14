package org.shauryabahl08.exceptions.leasson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleHandlingAnException {

    public static void main(String[] args) {

        // try catch block
        File file = new File("unknow.txt");

        /**
         * try {
         *     //code that can throw an exception
         * } catch (Exception e) {
         *      // if the exception occurs, do something else
         * }
         */

        try {
            // add a code that can throw an exception
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            // print
            // we send some notification
            System.out.println("Hey please check the file name, it is not found");
        }



    }
}
