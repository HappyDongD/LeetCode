package 专项练习.动态规划;

import java.util.Arrays;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/russian-doll-envelopes/
 *
 *   此问题相当于最长上升子序列的变种问题
 * @date 2021/3/5-11:05
 */
public class Code345俄罗斯套娃信封问题 {
    public int maxEnvelopes(int[][] envelopes) {

        int m = envelopes.length;

        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);

        int[] f = new int[m];
        int max = 1;
        for (int i = 0; i <= m - 1; i++) {
            f[i] = 1;
            for (int j = i; j >= 0; j--) {
                if (envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]) {
                    f[i] = Math.max(f[i], f[j] + 1);

                }
            }
            max = Math.max(f[i], max);
        }
        return max;
    }
}
