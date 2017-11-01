//CS210(c) F2017
//Liam,Thompson
//this program prints 1-10 to the power of 2.

public class ForLoopMath {
    public static void main(String[] args) {
        //repeats the the following operation of i^2 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.print((int)Math.pow(i, 2) + " ");
        }
    }
}
