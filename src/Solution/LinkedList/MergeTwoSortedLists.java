package Solution.LinkedList;
import Solution.ListNode;

public class MergeTwoSortedLists {
    public static ListNode solution(ListNode one, ListNode two){
        if(one==null) return two;
        if(two==null) return one;
        if(one==null && two==null) return null;
        ListNode merged = new ListNode(0);
        ListNode p = merged;
        while(one!=null&&two!=null){
            if(one.data < two.data){
                p.next = one;
                one = one.next;
            }
            else{
                p.next = two;
                two = two.next;
            }
            p = p.next;
        }
        if(one!=null){
            p.next = one;
        }
        if(two!=null){
            p.next = two;
        }
        return merged.next;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        a.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        ListNode b = new ListNode(3);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(6);
        ListNode node9 = new ListNode(6);
        ListNode node10 = new ListNode(7);
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(10);
        b.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = null;

        ListNode merged = solution(a, b);
        while(merged!=null){
            System.out.println(merged.data);
            merged = merged.next;
        }
    }
}
