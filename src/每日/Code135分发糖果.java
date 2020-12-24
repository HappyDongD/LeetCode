package 每日;

import java.util.Arrays;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/candy/
 * 遍历两次，从左到右加一遍，从右到左继续遍历一遍。
 * 左-》右，右边如果更大就+1；
 * 右-》左，左边如果更大，且值小于，也+1.
 * @date 2020/12/24-9:49
 */
public class Code135分发糖果 {
    public int candy(int[] ratings) {
        int len= ratings.length;
        if(len==0){
            return 0;
        }
        int[] r=new int[len];
        Arrays.fill(r,1);
        int res=0,i=0;
        int start=1;
        while(start!=len){
            if(ratings[i]<ratings[start]){
                r[start]=r[i]+1;
            }
            i++;
            start++;
        }
        start=len-2;
        i=len-1;
        while(start>=0){
            if(ratings[i]<ratings[start]){
                if(r[i]>=r[start]){
                    r[start]=r[i]+1;
                }
            }
            start--;
            i--;
        }
        for(int c:r){
            res+=c;
        }
        return res;
    }
}
