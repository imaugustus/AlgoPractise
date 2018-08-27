package Solution.LinkedList;

import java.util.ArrayList;
import java.util.Stack;
import Solution.ListNode;

public class ReversePrint {
    public static ArrayList<Integer> reversePrint(ListNode listNode) {
        Stack<Integer> value = new Stack<>();
        while(listNode!=null){
            value.push(listNode.data);
            listNode = listNode.next;
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(!value.empty()){
            int top = value.pop();
            result.add(top);
        }
        return result;
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
        ArrayList<Integer> res = reversePrint(head);
        System.out.println("Stop");
    }
}
