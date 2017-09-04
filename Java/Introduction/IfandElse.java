/*
 * Sapayth Hossain
 */
package Introduction;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class IfandElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n <= 5) {
            System.out.println("Not Weird");
        } else if (n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }
        System.out.println(ans);

    }
}
