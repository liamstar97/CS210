import java.util.*;

public class RollDice {
    public static void main(String[] args) {
        recursiveDice(userSum(), 0, 0);
    }



    private static void recursiveDice(int userSum, int tries, int sum) {
        Random rand = new Random();
        if (sum != userSum) {
            int i = rand.nextInt(6) + 1;
            int j = rand.nextInt(6) + 1;
            sum = i + j;
            System.out.println(i + " + " + j + " = " + sum);
            tries++;
            recursiveDice(userSum, tries, sum);
        } else {
            System.out.println("You got " + userSum + " after " + tries + " tries!");
        }

    }

    private static int userSum() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please enter a sum between 2 and 12: ");
            int i = scanner.nextInt();
            if (i >= 2 && i <= 12) {
                return i;
            } else {
                System.out.println("\nThat is an invalid number, please try again.");
                return userSum();
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("\nThat is not a number, please try again.");
            return userSum();
        }
    }
}