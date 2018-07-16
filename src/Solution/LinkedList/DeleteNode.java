package Solution.LinkedList;
import Solution.ListNode;


public class DeleteNode {
    public static void solution(ListNode head, ListNode val){
        if(head==null) return ;
        val.data = val.next.data;
        val.next = val.next.next;

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
//        solution(head, node1);
        solution(head, head);
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }

    }
}
