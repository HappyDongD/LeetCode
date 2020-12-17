package 每日;


import java.util.HashMap;

/**
 * @author zhang dong
 * @Description
 * 找到第一个符合单调的情况，进行减1 ，后面全变9
 * @date 2020/12/15-11:02
 */
public class Code738单调递增的数字 {
    public int monotoneIncreasingDigits(int N) {

        char[] chars = String.valueOf(N).toCharArray();
        int k=chars.length;
        for(int i=chars.length-1;i>0;i--){
            if (chars[i]<chars[i-1]){
                chars[i - 1]-= 1;
                k=i;
            }
        }
        for (int j=k;j<chars.length;j++){
            chars[j]='9';
        }
        return Integer.valueOf(new String(chars));
    }
}
