package org.shauryabahl08.strings;

public class StringQuestion {

    public static void main(String[] args) {
        String str = "HEllo World"; // eoo -> 3
        int vowelsCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelsCount);

        String words = "My Name is Aman";
        int wordsCount = countWords(words);
        System.out.println("Number of words in the string: " + wordsCount);

        String str2 = "Hello World"; // 2
        int charCount = countChar(str2, 'l');
        System.out.println("Number of occurrences of 'l' in the string: " + charCount);
    }


    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
                count++;
            }
        }

        return count;
    }

    public static int countWords(String words) {
        // "My Name is Aman" you can't use split()
//        String[] arr = words.split(" "); // ["My", "Name", "is", "Aman"]
//        return arr.length;
        if (words.isEmpty()) {
           return 0;
        }

        int count = 0;

        for(int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if(ch == ' ') {
                count++;
            }
        }

        return count + 1;
    }

    public static int countChar(String str, char findChar) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == findChar) {
                count++;
            }
        }
        return count;
    }
}
