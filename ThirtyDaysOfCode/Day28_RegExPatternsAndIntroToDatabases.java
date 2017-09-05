/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.*;

/*
 * @author sapaythhossain
 */
public class Day28_RegExPatternsAndIntroToDatabases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> user = new ArrayList<String>();
        for (int a0 = 0; a0 < N; a0++) {
            String firstName = in.next();
            String emailID = in.next();
            if (emailID.split("@")[1].equals("gmail.com")) {
                user.add(firstName);
            }
        }
        Collections.sort(user);
        for (String u : user) {
            System.out.println(u);
        }
    }
}
