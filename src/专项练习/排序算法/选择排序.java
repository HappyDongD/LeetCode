package 专项练习.排序算法;

/**
 * @author zhang dong
 * @Description 从小到大排序  比较稳定 o(n^2)
 * @date 2021/6/29-15:47
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] f = new int[]{3, 5, 67, 2};
        paixu(f);
        for (int i : f) {
            System.out.println(i);
        }
    }

    public static int[] paixu(int[] ls) {
        //先找最小的
        int min=0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = i; j <ls.length; j++) {
                if (ls[min]>ls[j]){
                    min = j;
                }
            }
            int temp = ls[min];
            ls[min] = ls[i];
            ls[i] = temp;
        }

        return ls;
    }
}
