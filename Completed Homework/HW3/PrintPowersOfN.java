// CS210 F2017 Assignment HW3
// Liam Thompson
// This program prints p times: b^p

public class PrintPowersOfN {
    public static void main(String[] args) {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
    }

    /**
     * prints p powers of b^p
     * @param b base
     * @param p power
     */
    public static void printPowersOfN(int b, int p) {
        for (int i = 0; i <= p; i++) {
            System.out.print((int)Math.pow(b, i) + " ");
        }
        System.out.println();
    }
}
