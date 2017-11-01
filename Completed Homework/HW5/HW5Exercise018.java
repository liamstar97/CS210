//CS210(c) F2017
//Liam Thompson
//This program returns the sum of n digits

public class HW5Exercise018 {
    public static void main(String[] args) {
        System.out.println(digitSum(10));
    }

    /**
     * returns the sum of every digit of the passed in int
     * @param n an integer
     * @return sum of n digits
     */
    public static int digitSum(int n) {
        int sum = 0;
        int i = 1;
        n = Math.abs(n);
        while (n >= i) {
            sum += ((n % (i * 10)) / i);

            i *= 10;
        }
        return sum;
    }
}
