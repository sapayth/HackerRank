/*
 * Sapayth Hossain
 */
package Introduction;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class LoopsI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.printf( "%d x %d = %d%n", N, i, (i * N) );
        }
    }
}
