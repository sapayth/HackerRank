/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day11_2DArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        int interimSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
                if (i > 1 && j > 1) {
                    interimSum = arr[i][j - 2] + arr[i][j - 1] + arr[i][j] + arr[i - 1][j - 1] + arr[i - 2][j - 2] + arr[i - 2][j - 1] + arr[i - 2][j];
                    if (maxSum < interimSum) {
                        maxSum = interimSum;
                    }
                }
            }
        }
        System.out.println(maxSum);

    }
}
