package leetcode;

public class MaximumDepthofBinaryTree {
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);

        return Math.max(left,right)+1;
    }
    public static  void main(String[] args) {
//        make "BinaryTree tree = new BinaryTree();" of the class,if the class is not public
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(maxDepth(root));
    }
}
