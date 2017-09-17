/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.*;

/*
 * @author sapaythhossain
 */
public class Day18_QueuesAndStacks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18_QueuesAndStacks p = new Day18_QueuesAndStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
// Write your code here.
    LinkedList q;
    Stack st;

    // constructor
    public Day18_QueuesAndStacks() {
        q = new LinkedList();
        st = new Stack();
    }

    public void pushCharacter(char c) {
        st.push(c);
    }

    public void enqueueCharacter(char c) {
        q.addLast(c);
    }

    public char popCharacter() {
        return (char) st.pop();
    }

    public char dequeueCharacter() {
        return (char) q.remove(0);
    }
}
