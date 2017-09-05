/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day25_RunningTimeAndComplexity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt();

        for (int i = 0; i < max; i++) {
            int x = scan.nextInt();
            int maxCalc = x / 2;
            boolean prime = true;
            int y = 2;

            if (x <= 1) {
                prime = false;
            }

            if (x > 2 && x % 2 == 0) {
                prime = false;
            }

            while (prime && y <= maxCalc) {
                //System.out.println("Dividing " + x + " by " + y);
                if (x % y == 0) {
                    prime = false;
                }
                y++;
            }

            if (prime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
