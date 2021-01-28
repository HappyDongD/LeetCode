package 每日;

import java.util.Arrays;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/find-pivot-index/
 * @date 2021/1/28-14:21
 */
public class Code724寻找数组的中心索引 {
    /**解法1将计算的结果放入f[n]中
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        int[] f = new int[len];
        f[0] = nums[0];
        for (int i = 1; i < len; i++) {
            f[i] = f[i - 1] + nums[i];
        }
        int mid = 0;
        while (mid != len) {
            int left = 0;
            if (mid != 0) {
                left = f[mid - 1];
                }
            if (left == f[len - 1] - left - nums[mid]) {
                return mid;
            } else {
                mid++;
            }
        }
        return -1;
    }
    /**解法2 从左往右依次开始加
     * @param
     * @return
     */
    class Solution2 {
        public int pivotIndex(int[] nums) {
            int total = Arrays.stream(nums).sum();
            int sum = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (2 * sum + nums[i] == total) {
                    return i;
                }
                sum += nums[i];
            }
            return -1;
        }
    }
}
