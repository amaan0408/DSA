package com.algorithmsPractice.LinkedList;
import java.util.*;
public class FindCycle2 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

        public Node detectCycle(Node head) {
            Node slow = head;
            Node fast = head;



            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    break;
                }
            }
            if ((fast == null) || (fast.next == null)) {
                return null;
            }

            Node p1 = head;
            Node p2 = slow;

            while (p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
        public static void main(String[] args) {
            FindCycle2 a = new FindCycle2();
            LinkedList list = new LinkedList();
            Node head = new Node(1);
            Node second = new Node(2);


            head.next = second;
            second.next = null;
            Node b = a.detectCycle(head);
            System.out.println(b.data);
    }
}
