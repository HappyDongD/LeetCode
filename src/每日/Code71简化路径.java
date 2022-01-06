package 每日;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author zhangdong
 * @Description https://leetcode-cn.com/problems/simplify-path/
 * @date 2022/1/6-15:33
 */
public class Code71简化路径 {

    public static void main(String[] args) {
        String tes = "/home/";
        simplifyPath(tes);

    }

    public static String simplifyPath(String path) {
        String[] sp = path.split(
                "/"
        );
        Deque<String> deque = new ArrayDeque<>();

        for (String s : sp) {
            if (s != null && !s.equals("")) {
                if (s.equals(".")) {
                    continue;
                } else if (s.equals("..")) {
                    if (!deque.isEmpty()) {
                        deque.pop();
                    }
                } else {
                    deque.push(s);
                }
            }
        }
        String res = "";
        if (deque.isEmpty()) {
            res = "/";
        }
        while (!deque.isEmpty()) {
            res = res + "/" + deque.pollLast();
        }
        return res;
    }
}
