// CS210 F2017 Assignment HW3
// Liam Thompson
// this program prints a cube of numbers which increase downwards.

public class printGrid {
    public static void main(String[] args) {
        printGrid(4, 6);
    }

    /**
     * prints a cube of numbers which increase downwards
     * @param r rows
     * @param c columns
     */
    public static void printGrid(int r, int c) {
        for (int i = 1; i <= r; i++) {
            int n = i;
            for (int j = 0; j < c; j++) {
                System.out.print(n + " ");
                n += r;
            }
            System.out.println("");
        }
    }
}
