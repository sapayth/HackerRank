/*
 * Sapayth Hossain
 */
package Introduction;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class StaticInitializerBlock {

    // Write your code here
    static Scanner keyboard = new Scanner(System.in);
    static boolean flag = true;
    static int B;
    static int H;

    static {
        try {
            B = keyboard.nextInt();
            H = keyboard.nextInt();
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
