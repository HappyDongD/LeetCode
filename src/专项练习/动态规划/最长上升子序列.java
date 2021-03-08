package 专项练习.动态规划;

/**
 * @author zhang dong
 * @Description https://mp.weixin.qq.com/s?__biz=MzU0ODMyNDk0Mw==&mid=2247487722&idx=1&sn=8c55b4e41fa403f9677cc9213579aa45&chksm=fb4183cacc360adcfd55966d305c2549c2971d03ef1c2a229b463b9c18fcd403713d1ec20f96&scene=21#wechat_redirect
 * @date 2021/3/5-10:34
 */
public class 最长上升子序列 {
    public static int solution(int[] ma) {
        if (ma == null || ma.length == 0) {
            return 0;
        }
        //最少为1
        int max = 1;
        int f[] = new int[ma.length];
        for (int i = 0; i < ma.length; i++) {
            f[i]=1;
            for (int j=i;j>=0;j--){
                if (ma[j] < ma[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                    max = Math.max(f[i], max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] m = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(solution(m));
    }
}
