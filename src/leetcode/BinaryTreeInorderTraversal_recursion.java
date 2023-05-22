package leetcode;

import java.util.ArrayList;
import java.util.List;
//dont make it public
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
// dont make it public
//the binary tree class must be the main class enclosing everything
class BinaryTree {
    TreeNode root;

    BinaryTree() {
        root = null;
    }

         public static List<Integer> inorderTraversal(TreeNode root) {

             ArrayList<Integer> li = new ArrayList<Integer>();
             if (root == null) {
                 return new ArrayList<Integer>();
             }
//             addAll by this single statement,all elements of a list gets added to li
             li.addAll(inorderTraversal(root.left));
             li.add(root.val);
             li.addAll(inorderTraversal(root.right));

             return li;
         }

         public static void main(String[] args) {
             BinaryTree tree = new BinaryTree();
             tree.root = new TreeNode(1);
             tree.root.left = new TreeNode(12);
             tree.root.right = new TreeNode(9);
             tree.root.left.left = new TreeNode(5);
             tree.root.left.right = new TreeNode(6);
             System.out.print((inorderTraversal(tree.root)));
         }

     }
