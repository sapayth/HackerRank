/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day26_NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int dayA = scan.nextInt();
        int monthA = scan.nextInt();
        int yearA = scan.nextInt();

        int dayE = scan.nextInt();
        int monthE = scan.nextInt();
        int yearE = scan.nextInt();

        int fine = 0;

        if (yearA > yearE) {
            fine = 10000;
        } else if (yearA == yearE) {
            if (monthA > monthE) {
                fine = (monthA - monthE) * 500;
            } else if (monthA == monthE) {
                if (dayA > dayE) {
                    fine = (dayA - dayE) * 15;
                }
            } else {
                fine = 0;
            }
        } else {
            fine = 0;
        }
        System.out.println(fine);
    }
}
