
//CS210(c) F2017
//Liam,Thompson
//this program prints the homework's required output.

public class WellFormed {
    public static void main(String[] args) {
        println("A well-formed Java program has");
        println("a main method with { and }");
        println("braces.\n");
        println("A System.out.println statement");
        println("has ( and ) and usually a");
        println("String that starts and ends");
        println("with a \" character.");
        println("(But we type \\\" instead!)");
    }

    /**
     * shorthand print method.
     * @param string a string of text.
     */
    public static void println(String string) {
        System.out.println(string);
    }
}
