package leetcode;
import java.util.List;

import java.util.ArrayList;
import java.util.Stack;

class BinaryTree1{
        TreeNode root;

        BinaryTree1(){
            root=null;
        }
            public static List<Integer> inorderTraversal(TreeNode root){
                ArrayList<Integer> li=new ArrayList<Integer>();
                Stack<TreeNode> st =new Stack<TreeNode>();
                TreeNode curr=root;
//                if any of the the condition is satisfied
                while(!st.empty() || curr!=null){
                    while(curr!=null){
                        st.push(curr);//pushing each element it traverse through
//                    going to through the left end
                        curr=curr.left;
                    }
                    curr=st.pop();//when end is reached ie curr==null.pop helps to get the lasdt element added
                    li.add(curr.val);
                    curr=curr.right;

                }
              return li;
            }
    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(12);
        tree.root.right = new TreeNode(9);
        tree.root.left.left = new TreeNode(5);
        tree.root.left.right = new TreeNode(6);
        System.out.print((inorderTraversal(tree.root)));
    }

    }
