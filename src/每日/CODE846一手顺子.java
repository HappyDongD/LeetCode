package 每日;

import java.util.Arrays;

/**
 * @author zhangdong
 * @Description https://leetcode-cn.com/problems/hand-of-straights/
 * @date 2021/12/30-10:41
 */
public class CODE846一手顺子 {
    public static void main(String[] args) {
        int[] f = {1, 2, 3, 6, 2, 3, 4, 7, 8};
        System.out.println("isNStraightHand(f, 3) = " + isNStraightHand(f, 3));

    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        int len = hand.length;
        int[] h = new int[len];
        Arrays.sort(hand);

        for (int i = 0; i < len; i++) {
            //说明i未使用过
            if (h[i] == 0) {
                int j = i;
                int n = 0;
                while (j < len && n < groupSize) {
                    if (h[j] != -1) {
                        if (hand[j] - hand[i] == n) {
                            n++;
                            h[j] = -1;
                        } else if (hand[j] - hand[i] > n) {
                            return false;
                        }
                    }
                    j++;
                }
                if(n!=groupSize-1){
                    return false;
                }
            }
        }
        return true;
    }
}
