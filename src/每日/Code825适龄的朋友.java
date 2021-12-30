package 每日;

import java.util.Arrays;

/**
 * @author zhangdong
 * @Description TODO
 * @date 2021/12/27-11:39
 */
public class Code825适龄的朋友 {
    public static void main(String[] args) {

        int[] ints = {5, 24, 82, 108, 115};
        numFriendRequests(ints);
    }

    public static int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length, ans = 0;
        for (int k = 0, i = 0, j = 0; k < n; k++) {
            while (i < k && !check(ages[i], ages[k])) i++;
            if (j < k) j = k;
            while (j < n && check(ages[j], ages[k])) j++;
            System.out.println("right:" + j);
            System.out.println("left:" + i);
            ans += j - i - 1;
            System.out.println(ans);
            System.out.println("----");

        }
        return ans;
    }

    static boolean check(int x, int y) {
        if (y <= 0.5 * x + 7) return false;
        if (y > x) return false;
        if (y > 100 && x < 100) return false;
        return true;
    }


}

