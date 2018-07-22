package Solution.Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MaxTreeDepth {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) return null;
        else if(t1==null && t2!=null){
            return t2;
        }
        else if(t1!=null && t2==null){
            return t1;
        }
        else{
            TreeNode big = new TreeNode(0);
            big.val = t1.val + t2.val;
            big.left = mergeTrees(t1.left, t2.left);
            big.right = mergeTrees(t1.right, t2.right);
            return big;
        }
    }
}