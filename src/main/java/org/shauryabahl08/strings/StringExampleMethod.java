package org.shauryabahl08.strings;

public class StringExampleMethod {

    public static void main(String[] args) {
         String java = "java";

         // 1. Traverse
        for (int i = 0; i < java.length(); i++) {
            System.out.print(java.charAt(i) + " ");
        }
        System.out.println();

        // 2. Upper case: java --> JAVA
        String upperCase = java.toUpperCase();
        System.out.println("Upper case: " + upperCase);

        // 3. Lower case: JAVA --> java
        String lowerCase = upperCase.toLowerCase();
        System.out.println("Lower case: " + lowerCase);

        // 4. Contains: true/false
        String youtubeTitle = "Introduction to Java Programming";
        boolean isPresent = youtubeTitle.contains("Java");
        System.out.println("Is Java present in title: " + isPresent);

        // 5. Start with: true/false
        String phoneNumber = "+91-7888770232";
        System.out.println("Is start with +91: " + phoneNumber.startsWith("+91"));

        // 6. end with: true/false
        System.out.println("Is end with 132: " + phoneNumber.endsWith("132"));

        // Find the index of a character in a string
        // 7. indexOf() -> it retuen the index
        String email = "msingh@gmail.com";
        System.out.println("Index of @: " + email.indexOf("@"));

        // 8. lastIndexOf() -> it return the last index of the character
        System.out.println("Index of @: " + email.lastIndexOf("m"));

        // 9. substring -> msingh
        String name = email.substring(0, email.indexOf("@")); // start index, < end index
        System.out.println("Sub str: " + name);

        // get everything after @
        System.out.println(email.substring(email.indexOf("@") + 1));

        // 10. replace
        String str = "jave programming";
        String fixed = str.replace('m', 'a');
        System.out.println(fixed);

        String comment = "Hello this is a comment";
        // this is a --> your
        String commentFixed = comment.replace("this is a", "your");
        System.out.println(commentFixed);

        // 11. trim() -> user input
        String userName = "     Aman   ";
        userName = userName.trim();
        System.out.println(userName);
    }
}
