//CS210(c) F2017
//Liam,Thompson
//this program prints the fibonacci sequence.

public class FibonacciSequence {
    public static void main(String[] args) {
        loopedFibonacci();

        //the following commented code prints out the fibonacci sequence using a method being called recursively:

//        System.out.println("\nThis is printed using a recursive method:");
//        System.out.println("\nThe twelfth value of the fibonacci sequence is: " + recursiveFibonacci(1, 0, 12));
    }

    /**
     * uses a for loop to print the first 12 values of the fibonacci sequence
     */
    public static void loopedFibonacci() {
        int n1 = 1;
        int n2 = 0;
        int j;
        for (int i = 0; i < 12; i++) {
            j = (n1 + n2);
            System.out.print(j + " ");
            n1 = n2;
            n2 = j;
        }
        System.out.println();
    }

    /**
     * uses a recursive method to calculate the fibonacci sequence.
     * @param n1    first number
     * @param n2    second number
     * @param j     number of recursive calls
     * @return      recursively calls the method if j > 1, else it will return the last value of the sequence
     */
    public static int  recursiveFibonacci(int n1, int n2, int j) {
        int i = (n1 + n2);
        System.out.print(i + " ");
        n1 = n2;
        n2 = i;
        if (j > 1) {
            return recursiveFibonacci(n1, n2, j - 1);
        } else {
            return i;
        }
    }
}
