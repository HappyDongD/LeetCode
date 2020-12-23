package 专项练习.二叉树;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 * 翻转之前102的list即可
 * 或者使用linkedlist，用add(0,bal)；
 * @date 2020/12/23-15:56
 */
public class Code107二叉树的层序遍历2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayDeque<TreeNode> deque= new ArrayDeque<TreeNode>();
        ArrayList res=  new ArrayList<List<Integer>>();
        if(root!=null){
            deque.add(root);
        }
        int size=0;
        while(!deque.isEmpty()){

            size=deque.size();
            ArrayList list=   new ArrayList<Integer>();
            for(int i=1;i<=size;i++){
                TreeNode node=deque.poll();
                list.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }

                if(node.right!=null){
                    deque.add(node.right);
                }

            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}

