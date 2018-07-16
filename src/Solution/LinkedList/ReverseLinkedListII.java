// Partly reverse the linked list
package Solution.LinkedList;

import Solution.ListNode;

class  ReverseLinkedListII{
    public static ListNode solution(ListNode head){

        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode reversed = solution(head);
        while(reversed.next!=null){
            System.out.println(reversed.data);
            reversed = reversed.next;
        }

    }

}

