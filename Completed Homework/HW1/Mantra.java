
//CS210(c) F2017
//Liam,Thompson
//this program prints the homework's required output.

public class Mantra {
    public static void main(String[] args) {
        //repeats the oneThing() method twice.
        for (int i = 0; i < 2; i++) {
           oneThing();
       }
    }

    /**
     * prints the one thing every coder must understand.
     */
    public static void oneThing() {
        println("There's one thing every coder must understand:");
        println("The System.out.println command.\n");
    }

    /**
     * shorthand print method.
     * @param string a string of text.
     */
    public static void println(String string) {
        System.out.println(string);
    }
}
