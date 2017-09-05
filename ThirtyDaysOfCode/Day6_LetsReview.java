/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day6_LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        String[] inputs = new String[t];

        for (int i = 0; i < t; i++) {
            inputs[i] = sc.nextLine();
        }

        for (int i = 0; i < inputs.length; i++) {
            String even = "";
            String odd = "";
            char[] chars = new char[inputs[i].length()];
            for (int j = 0; j < inputs[i].length(); j++) {
                chars[j] = inputs[i].charAt(j);
                if (j % 2 == 0) {
                    even += chars[j];
                } else {
                    odd += chars[j];
                }
            }

            System.out.println(even + " " + odd);
        }

    }
}
