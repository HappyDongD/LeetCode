package 每日;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv/
 * @date 2020/12/28-9:50
 */
public class Code188买卖股票最佳时机IV {
    public static void main(String[] args) {

//        int i = maxProfit(2, new int[]{2, 4, 1});
//        System.out.println("i = " + i);
    }
//todo 未解决 错误答案
    public  static  int maxProfit(int k, int[] prices) {

        if(k==0 | prices.length==0){
            return 0;
        }
        StringBuilder s = new StringBuilder();
        for (int price : prices) {
            s.append(price);
        }
        int[] temp=prices;
        Arrays.sort(temp);
        Stack<Integer> stack=new Stack<Integer>();
        int j=temp.length-1;
        for(int i=0;i<temp.length;i++){
            for(int m=j;m>i;m--){
                if(s.indexOf(temp[m]+"")>s.indexOf(temp[i]+"")){
                    stack.push(temp[m]-temp[i]);
                    j--;
                    break;
                }
            }
        }
        int res=0;
        if(!stack.isEmpty()){
            while(!stack.isEmpty()&&k>0){
                res+=stack.pop();
                k--;
            }
        }
        return res;

    }
}
