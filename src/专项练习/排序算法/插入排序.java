package 专项练习.排序算法;

/**
 * @author zhang dong
 * @Description 最好是o(n) 最差是o(n^2)
 * @date 2021/6/29-16:00
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] f = new int[]{3, 5, 4,67, 2};
        paixu(f);
        for (int i : f) {
            System.out.println(i);
        }
    }

    public static int[] paixu(int[] ls) {
        for (int i = 0; i < ls.length; i++) {
            int pre = i - 1;
            int index = ls[i];
            while(pre>=0&&ls[pre]>index){
                ls[pre+1] = ls[pre];
                pre--;
            }
            ls[pre +1]=index;
        }
        return ls;
    }
}
