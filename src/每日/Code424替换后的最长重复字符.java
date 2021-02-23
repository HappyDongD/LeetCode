package 每日;

import java.util.HashMap;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/longest-repeating-character-replacement/
 * @date 2021/2/2-11:36z
 */
public class Code424替换后的最长重复字符 {
    public int characterReplacement(String s, int k) {
        char[]  l= s.toCharArray();
        int max=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(char c:l){
            if(!map.containsKey(c)){
                map.put(c,1);
                max=Math.max(max,1);
            }else{
                map.put(c,map.get(c)+1);
                max=Math.max(max,map.get(c));
            }
        }
        if(k>l.length-max){
            return l.length;
        }else{
            return max+k;
        }
    }
}
