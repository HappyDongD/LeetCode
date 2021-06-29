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
        //从当前位置往前扫描，找到自己的位置
        for (int i = 0; i < ls.length; i++) {
            int preIndex=i-1;
            int current = ls[i];
            while(preIndex>=0&&ls[preIndex]>current){
                ls[preIndex + 1] = ls[preIndex];
                preIndex--;
            }
            ls[preIndex + 1] = current;
        }

        return ls;
    }
}
