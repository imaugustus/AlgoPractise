package Solution.LinkedList;

import Solution.ListNode;

class ReverseLinkedList{
    public static ListNode solution(ListNode head){
        if(head==null) return null;
        ListNode next = null;
        ListNode pre = null;
        while(head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    // Recursive method
    public static ListNode solution2(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode next = head.next;
        ListNode reversedHead = solution2(next);
        next.next = head;
        head.next=null;
        return reversedHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode tail = new ListNode(4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = tail;
        tail.next = null;
        // ListNode reversed = solution(head);
        ListNode reversed = solution2(head);
        while(reversed.next!=null){
            System.out.println(reversed.data);
            reversed = reversed.next;
        }
    }
}

