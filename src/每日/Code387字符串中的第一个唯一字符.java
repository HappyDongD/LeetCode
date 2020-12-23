package 每日;

import java.util.HashMap;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * 解法很憨憨，没啥好说的
 * 方法1：hashmap可以用数组代替
 * 方法2：String的APi
 * if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
 *                 return i;
 *             }
 * @date 2020/12/23-10:00
 */
public class Code387字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        char[] cl = s.toCharArray();
        int len = cl.length;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(cl[i])) {
                map.put(cl[i], map.get(cl[i]) + 1);
            } else {
                map.put(cl[i], 1);
            }
        }
        int res = -1;
        for (int i = 0; i < len; i++) {
            if (map.get(cl[i]) == 1) {
                res = i;
                break;
            }
        }
        return res;
    }
}
