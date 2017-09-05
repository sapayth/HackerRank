/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Day2_Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double cost = mealCost + (mealCost * tipPercent / 100) + (mealCost * taxPercent / 100);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(cost);

        // Print your result
        System.out.printf("The total meal cost is %d dollars.%n", totalCost);
    }
}
