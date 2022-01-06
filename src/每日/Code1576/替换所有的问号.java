package 每日.Code1576;

import java.util.Random;

/**
 * @author zhangdong
 * @Description https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
 * @date 2022/1/5-10:02
 */
public class 替换所有的问号 {
    public static void main(String[] args) {
        System.out.println("modifyString(\"a?b\") = " + modifyString("a?b"));

    }

    public static String modifyString(String s) {
        char[] cs = s.toCharArray();
        Random r = new Random();
        int i = 0;
        while (i < cs.length) {
            if (cs[i] == '?') {
                cs[i] = (char) ('a' + r.nextInt(3));
                if (i + 1 < cs.length && cs[i] == cs[i + 1]) {
                    cs[i] = '?';
                    continue;
                }
                if (i - 1 >= 0 && cs[i] == cs[i - 1]) {
                    cs[i] = '?';
                    continue;
                }
            }
            i++;
        }
        return new String(cs);
    }
}
