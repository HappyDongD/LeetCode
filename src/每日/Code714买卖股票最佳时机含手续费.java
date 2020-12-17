package 每日;

/**
 * @author zhang dong
 * @Description
 * @date 2020/12/17-17:41
 */
public class Code714买卖股票最佳时机含手续费 {
    public int maxProfit(int[] prices, int fee) {
        //第i天可能持有股票，也可能不持有股票。
        //d[i][0]表示第i天不持有股票的最大收益，则可能前一天不持有，也可能前一天持有，今天卖出。
        //d[i][1]表示第i天持有股票的最大收益，则前一天可能持有，也可能前天不持有，今天买入。
        int len=prices.length;
        int[][] d=new int [len+1][2];
        d[0][0]=0;

        //第一天持有股票收益为负数
        for(int i=1;i<len+1;i++){
            //不持有
            d[i][0]=Math.max(d[i-1][0],prices[i-1]+d[i-1][1]-fee);
            //持有股票
            d[i][1]=Math.max(d[i-1][1],d[i-1][0]-prices[i-1]);
            if(i==1){
                d[i][1]=-prices[0];
            }
        }
        return d[len][0];
    }
}
