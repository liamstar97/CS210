//CS210(c) F2017
//Liam Thompson
//This program returns a boolean if the sum of two of the three passed in integers is smaller than the third

public class HW5Exercise015 {
    public static void main(String[] args) {
       System.out.println(dominant(4, 9, 2));
    }

    /**
     * adds two of three integers together and returns true if the third is greater than the sum.
     * @param i int 1
     * @param j int 2
     * @param k int 3
     * @return true if one of three integers are greater than the sum of the other two.
     */
    public static boolean dominant(int i, int j, int k) {
        return (i + j < k || j + k < i || k + i < j);
    }
}
