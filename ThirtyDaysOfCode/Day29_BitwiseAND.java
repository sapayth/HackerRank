/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day29_BitwiseAND {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] arrayA = new int[t];
        int[] arrayB = new int[t];

        //array cycles
        for (int i = 0; i < t; i++) {
            arrayA[i] = scan.nextInt();
            arrayB[i] = scan.nextInt();

        }
        int kAux = 0;
        int aAux = 0;
        int calcAux = 0;

        for (int j = 0; j < t; j++) {
            aAux = arrayA[j];
            kAux = arrayB[j];
            calcAux = 0;

            //cycle
            for (int l = 0; l < aAux; l++) {
                for (int m = l + 1; m <= aAux; m++) {

                    if (((l & m) > calcAux) && ((l & m) < kAux)) {
                        calcAux = l & m;
                    }
                }
            }
            System.out.println(calcAux);
        }
    }
}
