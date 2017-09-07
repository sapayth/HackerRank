/*
 * Sapayth Hossain
 */
package Java.Strings;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
class UsernameValidator {

    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z_0-9]{7,29}$";
    // ^ Start of String/line
    // [a-zA-Z] any uppercase or lowercase alphabate
    // [a-zA-Z_0-9] uppercase or lowercase alphabates and _ and 0 to 9
    // {7,29} character length between 8 to 30
    // $ end of String/line
    
    
}

public class ValidUsernameRegularExpression {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
