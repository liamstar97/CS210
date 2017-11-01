// CS210 F2017 Assignment HW3
// Liam Thompson
// This program prints the area of a circle of a given radius.

public class Area {
    public static void main(String[] args) {
        System.out.println(area(2.0));
    }

    /**
     * returns the area of a circle of radius d
     * @param d radius
     * @return area of circle
     */
    public static double area(double d) {
        return Math.PI * (Math.pow(d, 2));
    }
}
