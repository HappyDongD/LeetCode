package 专项练习.二分法;

/**
 * @author zhang dong
 * @Description  https://leetcode-cn.com/problems/first-bad-version/
 * @date 2020/12/21-15:35
 */
public class Code278第一个错误版本 {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int mid = 0;
            int start = 1;
            int end = n;
            while (start + 1 < end) {
                //中间位置
                mid = start + (end - start) / 2;
                //如果是错误的版本
                if (isBadVersion(mid)) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            if (isBadVersion(start)) {
                return start;
            } else {
                return end;
            }
        }
    }
}
