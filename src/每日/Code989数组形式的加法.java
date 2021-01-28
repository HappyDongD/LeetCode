//package 每日;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
///**
// * @author zhang dong
// * @Description https://leetcode-cn.com/problems/add-to-array-form-of-integer/
// * @date 2021/1/22-11:10
// */
//public class Code989数组形式的加法 {
//    public static void main(String[] args) {
//        int[] A = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
//        int K = 1;
//        addToArrayForm(A, K);
//    }
//
//    public static List<Integer> addToArrayForm(int[] A, int K) {
//        int len = A.length;
//        Deque<Integer> deque = new ArrayDeque<>();
//        while (K > 0) {
//            deque.push(K % 10);
//            K /= 10;
//        }
//        ArrayList<Integer> res = new ArrayList<>();
//        while (!deque.isEmpty()){
//
//
//        }
//
//
//
//
//        return list;
//
//    }
//}
