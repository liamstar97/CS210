//CS210(c) F2017
//Liam,Thompson
//this program prints a number line with vertical bars above the zeros denoting a grouping of 10.

public class NumberLine {
    public static void main(String[] args) {
        numLine();
    }

    public static void numLine() {
        int lineWidth = 10;
        int lines = 6;
        for (int i = 0; i < lines; i++) {
            for (int j = 1; j < lineWidth; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for (int i = 0; i < lines; i++) {
            for (int j = 1; j < lineWidth; j++) {
                System.out.print(j);
            }
            System.out.print("0");
        }
    }
}
