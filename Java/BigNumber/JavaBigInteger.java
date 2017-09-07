package Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Sapayth Hossain
 */

 /*
 * @author sapaythhossain
 */
public class JavaBigInteger {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        
        if (a.compareTo(BigInteger.ZERO) < 0 || b.compareTo(BigInteger.ZERO) < 0) {
            // print error if input is negative 
            System.err.println("Negative input!!!");
        } else {
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));
        }
    }
}
