/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {

    private int[] elements;
    public int maximumDifference;
// Add your code here

    public Difference(int[] a) {
        elements = new int[a.length];
        System.arraycopy(a, 0, elements, 0, a.length);
    }

    public void computeDifference() {
        int high = elements[0];
        int low = elements[0];

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > high) {
                high = elements[i];
            }
            if (elements[i] < low) {
                low = elements[i];
            }
        }

        maximumDifference = high - low;

    }
}