package 专项练习.二叉树;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 * 将偶数次的层数list直接翻转即可。 或者使用add(0,val)；
 *
 * @date 2020/12/23-17:05
 */
public class Code103二叉树的锯齿形层序遍历 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(Code107二叉树的层序遍历2.TreeNode root) {
            ArrayDeque<Code107二叉树的层序遍历2.TreeNode> deque = new ArrayDeque<Code107二叉树的层序遍历2.TreeNode>();
            ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
            if (root != null) {
                deque.add(root);
            }
            boolean b = true;
            int size = 0;
            while (!deque.isEmpty()) {
                size = deque.size();
                ArrayList<Integer> list = new ArrayList<Integer>(size);
                for (int i = 0; i < size; i++) {
                    Code107二叉树的层序遍历2.TreeNode node;
                    node = deque.poll();
                    list.add(node.val);
                    if (node.left != null) {
                        deque.add(node.left);
                    }
                    if (node.right != null) {
                        deque.add(node.right);
                    }
                }
                if (!b) {
                    Collections.reverse(list);
                }
                b = !b;
                res.add(list);

            }
            return res;
        }
    }
}
