package org.shauryabahl08.strings;

public class StringLearning {

    public static void main(String[] args) {
        // char vs String?
        // String is not a primitive datatype
        String name1 = "Mohit"; // M is present at index 0
        char[] name2 = {'M', 'o', 'h', 'i', 't'};
        System.out.println(name1); // Mohit

//        for(int i = 0; i < name2.length; i++) {
//            System.out.print(name2[i]); // Mohit
//        }
        // length() is a function of String
        // charAt() is a function of String
        System.out.println("Len of name1: " + name1.length());
        for(int i = 0 ; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
        }

        // Can i update the string?
        // Yes
        // String are Immutable
        // means you can't modify string
        String blog = "This is m blog";
        blog = "This is my blog";

        String blog2 = "Bla Bla blog";
        blog2 = blog2 + " bla bla bla";
        // char[] c1 = [......]
        // char[] c2 = [.....]
        // char[] result = c1 + c2
        // It will update the string?
        // No

    }
}
