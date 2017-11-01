//CS210(c) F2017
//Liam Thompson
//This program returns the gcd of two passed in numbers

public class HW5Exercise002 {
    public static void main(String[] args) {
        System.out.println(gcd(0, 2));
    }

    /**s
     * finds the GCD of two numbers
     * @param i int 1
     * @param j int 2
     * @return gcd
     */
    public static int gcd(int i, int j) {
        while (j != 0) {
            int k = j;
            j = i % j;
            i = k;
        }
        return i;
    }
}
