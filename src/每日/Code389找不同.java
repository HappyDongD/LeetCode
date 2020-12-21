package 每日;

/**
 * @author zhang dong
 * @Description
 * 解题思路： 通过异或操作，查找出添加的数据。
 * res ^= sc[i] ^ tc[i]; 相同的部分会消除掉，最后剩下的就是不同的部分
 * @date 2020/12/18-9:43
 */
public class Code389找不同 {
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) {
            return t.charAt(0);
        }
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        char res = 0;

        for (int i = 0; i < s.length(); i++) {
            res ^= sc[i] ^ tc[i];
        }
        return (char) (res ^ tc[t.length() - 1]);
    }
}
