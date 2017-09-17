/*
 * Sapayth Hossain
 */

package Java.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @author sapaythhossain
 */
public class SubstringComparisons {
public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int n = in.nextInt();
        int t = n-1;
        
        ArrayList<String> subs = new ArrayList<>();
        
        for(int i = 0; i < word.length()-t; i++ ) {
            String tmp = word.substring(i,n);
            subs.add( tmp );
            n++;
        }
        Collections.sort(subs);
        System.out.println( subs.get(0) );
        System.out.println( subs.get( subs.size()-1 ) );
    }
}