package 每日;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/can-place-flowers/
 * 每次跳两格，是0判断下一个是否种了，如果种了则移动到下一个进行调两格，如果没种说明可以种
 * @date 2021/1/12-11:38
 */
public class Code605种花问题 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i+=2){
            if(flowerbed[i]==0){
                if(i+1!=flowerbed.length&&flowerbed[i+1]==1){
                    i++;
                } else{
                    n--;
                }
            }
        }
        return n<=0;
    }
}
