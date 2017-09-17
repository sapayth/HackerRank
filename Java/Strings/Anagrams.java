/*
 * Sapayth Hossain
 */
package Java.Strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = false;
        if (a.length() != b.length()) {
            return result;
        }
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);

        result = Arrays.equals(a1, b1);
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
