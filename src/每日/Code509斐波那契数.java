package 每日;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/fibonacci-number/
 * @date 2021/1/4-11:37
 */
public class Code509斐波那契数 {
    public int fib(int n) {
        //f[n]=f[n-1]+f[n-2];

        int [] f=new int[n+1];
        f[0]=0;
        if(n>0){
            f[1]=1;
        }
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];

    }
}
