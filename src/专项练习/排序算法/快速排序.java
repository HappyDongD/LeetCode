package 专项练习.排序算法;

/**
 * @author zhang dong
 * @Description
 * @date 2021/2/23-9:41
 */
public class 快速排序 {

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, temp, t;
        if (right <= left) {
            return;
        }
        i = left;
        j = right;
        //基准位置
        temp = arr[left];
        while (i < j) {
            //从右往左，找到比temp小的数
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //从左往右找到比temp大的数值
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //满足条件则进行位置交换
            if (i<j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        //将基准数调换到i和J交汇位置
        arr[left] = arr[i];
        arr[i] = temp;
        //将数组划分为左右两边继续调用
        //左边
        quickSort(arr,left,i-1);
        //右边
        quickSort(arr,i+1,right);
    }

    /**
     *  采用尾递归方式计算斐波那契数列
     */
    public  static long tailRecursiveFib(long a,long b,int n)
    {
        if(n <0 ) return -1;
        if(n == 0) return a;
        if(n == 1) return b;

        //返回值出现在函数的末尾，且没有包含其他表达式，是尾递归！
        System.out.println("b的值:"+ b+"  a+b的值："+ (a + b)+"  n-1的值"+ (n - 1));
        return tailRecursiveFib(b, a+b, n-1);
    }

    public static void main(String[] args) {
        long result = tailRecursiveFib(0L,1L,5);
        System.out.println("result = " + result);

//        int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
//        quickSort(arr, 0, arr.length - 1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
