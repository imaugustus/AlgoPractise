package Solution.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraverseTree {
    public static List<Integer>  InorderTraverseTree(TreeNode root){
        if(root.left==null && root.right==null){
            List<Integer> res = new ArrayList<>(1);
            res.add(root.val);
            return res;
        }
        else if((root.left==null && root.right!=null)){
            List<Integer> res = new ArrayList<>(1);
            res.add(root.val);
            List<Integer> right = InorderTraverseTree(root.right);
            res.addAll(right);
            return res;
        }
        else if(root.left!=null && root.right==null){
            List<Integer> res = InorderTraverseTree(root.left);
            res.add(root.val);
            return res;
        }
        else{
            List<Integer> res = InorderTraverseTree(root.left);
            res.add(root.val);
            List<Integer> right = InorderTraverseTree(root.right);
            res.addAll(right);
            return res;
        }
    }

    public static void InOrderTraverseIter(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        while(root!=null || !s.empty()){
            if(root!=null){
                s.push(root);
                root = root.left;
            }
            else{
            root = s.pop();
            System.out.println(root.val);
            root = root.right;
            }
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left_2 = new TreeNode(4);
        TreeNode right_2 = new TreeNode(1);
        TreeNode left_3_1 = new TreeNode(-2);
        TreeNode right_3_2 = new TreeNode(8);
        root.left = left_2;
        root.right = right_2;
        left_2.left = left_3_1;
        right_2.right = right_3_2;
        List<Integer> res = InorderTraverseTree(root);
        InOrderTraverseIter(root);
        System.out.println("Program finished");
    }
    //https://www.linuxidc.com/Linux/2015-04/116022.htm
}
