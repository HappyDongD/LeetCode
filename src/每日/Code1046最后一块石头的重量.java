package 每日;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/last-stone-weight/
 * @date 2020/12/30-11:01
 */
public class Code1046最后一块石头的重量 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)->b-a);
        for (int stone : stones) {
            queue.add(stone);
        }
        while(queue.size()>1){
            int a = queue.poll();
            int b = queue.poll();
            if(a>b){
                queue.offer(a - b);
            }
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}
