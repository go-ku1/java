package leetcode;

public class SymmetricTree_recursion {
    TreeNode root;
    SymmetricTree_recursion(){root=null;}
        public static boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isMirror(root.left, root.right);
        }
//        here we have to make another function which accepts 2 values.
//        we dont want to go deeper and deeper on the same side
//        we need to compare 2 parameters in 2 different directions deeper
        public static boolean isMirror(TreeNode curr1,TreeNode curr2){
            if(curr1==null ||curr2==null){
                return true;
            }
            if(curr1!=null && curr2!=null && curr1.val==curr2.val){
                return (isMirror(curr1.left,curr2.right) && isMirror(curr2.left,curr1.right));
            }
            return false;
        }
    public static  void main(String[] args){
//        make "BinaryTree tree = new BinaryTree();" of the class,if the class is not public
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
//if we had made the binary tree object ,then call function as tree.isSymmetric
        if(isSymmetric(root))
            System.out.print("Symmetric");
        else
            System.out.print("not Symmetric");
    }


}
