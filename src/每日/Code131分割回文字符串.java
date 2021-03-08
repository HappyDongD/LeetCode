package 每日;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/palindrome-partitioning/
 * @date 2021/3/8-14:19
 */
public class Code131分割回文字符串 {

    public List<List<String>> partition(String s) {
        char[] c = s.toCharArray();
        int len = c.length;
        List<List<String>> res = new ArrayList<>();
        int index = 0;
        ArrayDeque<String> path = new ArrayDeque<>();
        dfs(c, index, len, res, path);
        return res;
    }

    public void dfs(char[] c, int index, int len, List<List<String>> res, ArrayDeque<String> path) {
        if (index == len) {
            res.add(new ArrayList(path));
            return;
        }
        for (int i = index; i < len; i++) {
            //判断是否是回文串
            if (!check(c, index, i)) {
                continue;
            }
            path.add(new String(c,index,i+1-index));
            dfs(c, i + 1, len, res, path);
            path.removeLast();
        }
    }

    public boolean check(char[] c, int left, int right) {
        while (left < right) {
            if (c[left] != c[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Code131分割回文字符串 code131分割回文字符串 = new Code131分割回文字符串();
        code131分割回文字符串.partition("aab");
    }
}
