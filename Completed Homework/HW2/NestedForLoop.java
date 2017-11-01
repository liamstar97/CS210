//CS210(c) F2017
//Liam,Thompson
//this program prints a right triangle of stars.

public class NestedForLoop {
    public static void main(String[] args) {
        triStar();
    }

    /**
     * prints out asterisks in the form of a right triangle
     */
    public static void triStar() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
