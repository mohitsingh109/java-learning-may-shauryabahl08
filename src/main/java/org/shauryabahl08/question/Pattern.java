package org.shauryabahl08.question;

public class Pattern {

    //dim = 5
    // @**** (row 0, col 0)
    // *@*** (row 1, col 1)
    // **@** (row 2, col 2)
    // ***@* (row 3, col 3)
    // ****@ (row 4, col 4)

    //result="@****\n*@***\n**@**\n"
    //row = 2
    //col = 0, 1, 2, 3, 4


    public static String buildPattern(int dim) {

        String result = "";

        for(int row = 0; row < dim; row++) { // run row times

            for(int col = 0; col < dim; col++) {
                if(row == col) { // row = 0 & col = 0
                    //System.out.print("@");
                    result += "@";
                } else {
                    //System.out.print("*");
                    result += "*";
                }
            }
            //System.out.println(); // move to next line
            result += "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        String result = buildPattern(5);
        System.out.println(result);
    }
}
