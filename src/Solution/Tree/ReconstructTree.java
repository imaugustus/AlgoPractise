package Solution.Tree;


public class ReconstructTree {
    public static TreeNode Reconstruct(int[] preOrder, int[] inOrder){
        if(preOrder==null&&inOrder==null) return null;
        return Reconstruct(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
    }

    public static TreeNode Reconstruct(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd){
        if(preStart>preEnd) return null;
        int val  = preOrder[preStart];
        TreeNode root  = new TreeNode(val);
        int midIndex=inStart;
        for(int i=inStart; i<=inEnd; i++){
            if(inOrder[i]==val){
                midIndex = i;
                break;
            }
        }
        int left_size = midIndex-inStart;
        int left_index = preStart + left_size;
        root.left = Reconstruct(preOrder, preStart+1, left_index, inOrder, inStart, midIndex-1);
        root.right = Reconstruct(preOrder, left_index+1, preEnd, inOrder, midIndex+1, inEnd);
        return root;
    }

    public static void visualizeTree(TreeNode root){
        if(root!=null){
        visualizeTree(root.left);
        System.out.println(root.val);
        visualizeTree(root.right);
        }
    }

    public static void main(String[] args) {
        int[] preTest = {1,2,4,7,3,5,6,8};
        int[] inTest = {4,7,2,1,5,3,8,6};
        TreeNode rootTest = Reconstruct(preTest, inTest);
        visualizeTree(rootTest);
        System.out.println("Stop");
    }
}
