// CS210 F2017 Assignment HW3
// Liam Thompson
// prints the area of a triangle given side lengths.

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println(triangleArea(8, 5.2, 7.1));
    }

    /**
     * prints the area of a triangle given three side lengths
     * @param i side length 1
     * @param j side length 2
     * @param l side length 3
     * @return area of triangle
     */
    public static double triangleArea(double i, double j, double l) {
        double s = (i + j + l)/2;
        return Math.sqrt(s * ((s - i) * (s - j) * (s - l)));
    }
}
