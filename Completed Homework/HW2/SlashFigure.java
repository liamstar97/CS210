//CS210(c) F2017
//Liam,Thompson
//this program prints a figure made of bangs, and slashes.

public class SlashFigure {
    public static void main(String[] args) {
        figure();
        String s = "foobar";
    }

    /**
     * prints the figure that the homework specified using nested for loops
     */
    public static void figure() {
        for (int row = 0; row < 6; row++) {
            for (int bSlash = 0; bSlash < (row * 2); bSlash++) {
                print("\\");
            }
            for (int bang = 22 - (4 * row); bang > 0; bang--) {
                print("!");
            }
            for (int fSlash = 0; fSlash < (row * 2); fSlash++) {
                print("/");
            }
            println("");
        }
    }

    /**
     * shorthand println method that can print the string form of an object, or just a string.
     * @param object the object to be printed on its own line
     */
    public static void println(Object object) {
        System.out.println(object);
    }

    /**
     * shortand print method that can print the string form of an object, or just a string.
     * @param object the object to be printed
     */
    public static void print(Object object) {
        System.out.print(object);
    }
}
