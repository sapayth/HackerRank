/*
 * Sapayth Hossain
 */
package Java.Strings;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class StringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (A.length() > 1 && B.length() > 1) {
            System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)
                    + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
        } else {
            System.out.println("Input must be at least 1 character long ");
        }

    }
}
