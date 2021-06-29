package 专项练习.排序算法;

/**
 * @author zhang dong
 * @Description 从小到大排序  最差是o(n^2) 最好是o(n)
 *
 * @date 2021/6/29-15:39
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] f=new int[]{3,5,67,2};
        paixu(f);
        for (int i : f) {
            System.out.println(i);
        }
    }
    public  static int[] paixu(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j + 1];
                    ints[j + 1] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }

}
