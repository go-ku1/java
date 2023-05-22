package leetcode;

import java.util.Stack;

public class SymmetricTree_Stackanditeration {
    TreeNode root;

    public static boolean isSymmetric(TreeNode root){
        Stack<TreeNode> st=new Stack<>();
        st.push(root.left);
        st.push(root.right);

        while(!st.empty()){
            TreeNode curr1=st.pop();
            TreeNode curr2=st.pop();

            if(curr1==null && curr2==null){
                continue;
            }
            if(curr1==null || curr2==null){
                return false;
            }
            if(curr1.val!= curr2.val){
                return false;
            }
//            these2 nodes will be checked in next next while loop
            st.push(curr1.left);
            st.push(curr2.right);
//            these 2 nodes will be checked in next while loop
            st.push(curr1.right);
            st.push(curr2.left);
        }
        return true;
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
