package 每日;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/positions-of-large-groups/submissions/
 * @date 2021/1/5-16:38
 */
public class Code830较大分组的位置 {
    public List<List<Integer>> largeGroupPositions(String s) {
        char[] c = s.toCharArray();
        char temp = c[0];
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == temp) {
                end = i;
            } else {
                if (start != end && end - start >= 2) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(start);
                    list.add(end);
                    res.add(list);
                }
                start = i;
                end = i;
                temp = c[i];
            }
        }
        if (end - start >= 2) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(start);
            list.add(end);
            res.add(list);
        }
        return res;

    }
}
