package 每日;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 * 可以使用动态规划来做，最后一步是从倒数第一个阶梯或者倒数第二个阶梯来的
 * 那么f(n)=Math.min(f(n-1),f(n-2))
 * 边界条件f(0)和f(1)
 *
 * @date 2020/12/21-10:13
 */
public class Code746使用最小花费爬楼梯 {
    public int minCostClimbingStairs(int[] cost) {
        //f(n)=Math.min(f(n-1),f(n-2))
        int len=cost.length;
        int[] f=new int[len+1];
        f[0]=0;
        f[1]=0;
        for(int i=2;i<len+1;i++){
            f[i]=Math.min(f[i-1]+cost[i-1],f[i-2]+cost[i-2]);
        }
        return f[len];

    }
}
