/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day16_ExceptionsStringToInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int sInt = Integer.valueOf(S);
            System.out.println(sInt);
        } catch (NumberFormatException err) {
            System.out.println("Bad String");
        }
    }
}
