/*
 * Sapayth Hossain
 */
package Java.Strings;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String R = new StringBuilder(A).reverse().toString();

        if (A.equals(R)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}