package Solution.LinkedList;

import Solution.ListNode;

public class FindNthNodeFromEnd {
    public static ListNode solution(ListNode head, int N){
        if(head==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(N>1&& fast!=null){
            fast = fast.next;
            N--;
        }
        if(fast==null){
            return head;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        ListNode target = solution(head, 5);
        System.out.println(target.data);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
