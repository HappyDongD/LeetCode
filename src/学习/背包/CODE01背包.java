package 学习.背包;

/**
 * @author zhangdong
 * @Description https://mp.weixin.qq.com/s/xmgK7SrTnFIM3Owpk-emmg
 * 有 N件物品和一个容量是 V的背包。每件物品有且只有一件。
 * <p>
 * 第 i 件物品的体积是 v[i] ，价值是 w[i] 。
 * <p>
 * 求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。
 * @date 2021/12/29-14:11
 */
public class CODE01背包 {

    public int maxValue(int N, int C, int[] v, int[] w) {
        //f[][] 前i件物品，使用容量不超过c的背包最大价值   一维i表示第i个物品，二维c表示当前剩余容量
        //f[i][c]=max(f[i-1][c],f[i][c-v[i]]+w[i])
        int[][] f = new int[N][C + 1];
        for (int i = 0; i < C; i++) {
            f[0][i] = i >= v[i] ? w[i] : 0;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < C; j++) {
                int m = j >= v[i] ? f[i-1][j - v[i]] : 0;
                f[i][j] = Math.max(f[i - 1][j], m + w[i]);
            }
        }
        return f[N-1][C];
    }
    public int maxValue2(int N, int C, int[] v, int[] w) {
        //f[n] 背包容量为n的时候，最大值
        int f[] = new int[C + 1];
        f[0] = 0;
        for (int i = 0; i < v.length; i++) {
            //计算第I个物品，在背包容量为J时候的最大价值
            for (int j = C; j >= v[i]; j++) {
                f[j] = Math.max(f[j], f[j - v[i]] + w[i]);
            }
        }
        return f[C];
    }
}

