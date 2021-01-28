package 每日.Code1128;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/
 * @date 2021/1/26-10:35
 */
public class 等价多米诺骨牌对的数量 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int res=0;
        int[] c=new int[100];
        for (int[] dominoe : dominoes) {
            Arrays.sort(dominoe);
            res += c[dominoe[0] * 10 + dominoe[1]]++;
        }
        return res;
    }
}
