package 每日;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/contiguous-array/
 * @date 2021/6/3-10:22
 */
public class Code525连续的数组 {
 

    public int findMaxLength(int[] nums) {

        int k = 0;
        int len = nums.length;
        int[] sum = new int[len + 1];
        sum[0] = 0;
        for (int i = 1; i < len + 1; i++) {
            sum[i] = sum[i - 1] + (nums[i - 1] == 1 ? 1 : -1);
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //存在某个区间，代表该区间相加的值为0
        //通过前缀和可以知道，表示sum[i]-sum[j]=0
        for (int i = 2; i <= len; i++) {
            //记录最左的索引
            if (!map.containsKey(sum[i - 2])) {
                map.put(sum[i - 2], i - 2);
            }
            if (map.containsKey(sum[i] - k)) {
                res = Math.max(res, i - map.get(sum[i]));
            }

        }
        return res;
    }
}
