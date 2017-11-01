
//CS210(c) F2017
//Liam,Thompson
//this program prints the homework's required output.

public class Stewie2 {
    public static void main(String[] args) {
        forwardLine();
        //prints the victory() and backLine() methods 5 times
        for(int i = 0; i < 5; i++) {
            victory();
            backLine();
        }
    }

    /**
     * prints the forward facing line of the ascii art.
     */
    public static void forwardLine() {
        println("//////////////////////");
    }

    /**
     * prints the backwards facing line of the ascii art.
     */
    public static void backLine() {
        println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    /**
     * prints the victory statement of the ascii art.
     */
    public static void victory() {
        println("|| Victory is mine! ||");
    }

    /**
     * shorthand print method.
     * @param string a string of text.
     */
    public static void println(String string) {
        System.out.println(string);
    }
}
