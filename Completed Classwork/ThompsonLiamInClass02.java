/**
 * Created by liams on 9/21/2017.
 */

//CS210 F2017
//Liam Thompson
//this program prints out the blocks of text given to us in class.
public class ThompsonLiamInClass02 {
    public static void main(String[] args)  {
        //bullet point one:
        println("This program prints a");
        println("quote from the Gettysburg Address.\n");
        println("\"Four score and seven years ago,");
        println("our 'fore fathers' brought forth on");
        println("this continent a new nation.\"\n\n");

        //bullet point two:
        println("A \"quoted\" String is");
        println("\'much\' better if you learn");
        println("the rules of \"escape sequences.\"\n");
        println("Also, \"\" represents an empty String.");
        println("Don\'t forget: use \\\" instead of \" !");
        println("\'\' is not the same as \"");
    }

    /**
     * shorthand print method.
     * @param string a string of text.
     */
    public static void println(String string) {
        System.out.println(string);
    }
}
