package 每日;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/assign-cookies/
 * 排序后进行比较，注意之前第二个循环写的是j=i，结果在
 * [1,4,2,3]
 * [1,1,3,1]这种情况下发现饼干用了两次。 应该设置一个值去取代j=i。
 * @date 2020/12/25-9:40
 */
public class Code455分发饼干 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int temp = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = temp; j < s.length; j++) {
                if (g[i] <= s[temp]) {
                    res++;
                    temp++;
                    break;
                } else {
                    temp++;
                }
            }
            if (i + 1 == s.length) {
                return res;
            }
        }
        return res;
    }

    /**
     * 解法2： for变成while循环，符合条件的为child
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren2(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cookie=0;
        while(child<g.length&&cookie<s.length){
            if(g[child]<=s[cookie]){
                child++;
            }
            cookie++;
        }
        return child;
    }
}
