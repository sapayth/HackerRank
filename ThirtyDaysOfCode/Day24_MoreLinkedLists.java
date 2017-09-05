/*
 * Sapayth Hossain
 */
package ThirtyDaysOfCode;

import java.util.Scanner;

/*
 * @author sapaythhossain
 */
class Node4 {

    int data;
    Node4 next;

    Node4(int d) {
        data = d;
        next = null;
    }

}

public class Day24_MoreLinkedLists {

    public static Node4 removeDuplicates(Node4 head) {
        //Write your code here
        if (head.next == null) {
            return head;
        } else {
            Node4 cur = head;
            int a;
            Node4 after = cur.next;
            while (after != null) {
                if (cur.data == after.data) {
                    after = after.next;
                    if (after == null) {
                        cur.next = null;
                    }
                } else {
                    cur.next = after;
                    cur = after;
                    after = after.next;
                }
            }
        }
        return head;
    }

    public static Node4 insert(Node4 head, int data) {
        Node4 p = new Node4(data);
        if (head == null) {
            head = p;
        } else if (head.next == null) {
            head.next = p;
        } else {
            Node4 start = head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = p;

        }
        return head;
    }

    public static void display(Node4 head) {
        Node4 start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node4 head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}
