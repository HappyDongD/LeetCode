package 专项练习.二叉树;

import java.util.*;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * *
 * BFS广度优先搜索来做，BFS应用场景：层序遍历、最短路径。
 * @date 2020/12/23-10:50
 */
public class Code102二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(Code107二叉树的层序遍历2.TreeNode root) {
        ArrayDeque<Code107二叉树的层序遍历2.TreeNode> deque = new ArrayDeque<Code107二叉树的层序遍历2.TreeNode>();
        if (root != null) {
            deque.add(root);
        }
        int size = 0;
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        while (!deque.isEmpty()) {
            size = deque.size();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i <= size; i++) {
                Code107二叉树的层序遍历2.TreeNode node = deque.poll();
                list.add(node.val);
                if (node.left != null) {
                    deque.add(node.left);
                }
                if (node.right != null) {
                    deque.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

}
