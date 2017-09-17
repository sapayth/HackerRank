/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day10_BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = Integer.toBinaryString(n);

        int count = 0;
        int max = 0;

        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            if (c == '1') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }

        }
        System.out.println(max);
    }
}
