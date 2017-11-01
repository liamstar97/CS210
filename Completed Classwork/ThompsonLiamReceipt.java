
// CS210(C) F2017
// Thompson Liam
// Compute receipt total with tip

public class ThompsonLiamReceipt {
    public static void main(String[] args) {
        int subtotal = 38 + 40 + 30;
        double tax = (38 + 40 + 30) * .08;
        double tip = (38 + 40 + 30) * .15;
        double total = subtotal + tip + tax;

        // Calculate total owed, assuming 8% tax / 15% tip
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: " + tax);
        System.out.println("Tip: " + tip);
        System.out.println("Total: " + total);
    }
}