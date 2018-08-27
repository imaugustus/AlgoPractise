package Solution.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueByStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public void push(int data){
        s1.push(data);
    }

    public int pop(){
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int res = s2.pop();
        while(!s2.empty()) {
            s1.push(s2.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        QueueByStack test = new QueueByStack();
        test.push(2);
        test.push(4);
        test.push(10);
        test.push(35);
        int first = test.pop();
        System.out.println("Stop");
    }
}
