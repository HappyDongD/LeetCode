package 专项练习.二叉树;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * @date 2021/3/23-10:23
 */
public class Code104二叉树的最大深度 {
    public int maxDepth(Code107二叉树的层序遍历2.TreeNode root) {
        if(root!=null){

            int  l=   maxDepth(root.left);
            int r=    maxDepth(root.right);
            return Math.max(l,r)+1;
        }else{
            return 0;
        }
    }
}
