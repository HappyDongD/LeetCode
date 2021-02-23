package 专项练习.剑指offer;

class 二维数组遍历查找目标值 {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int l = matrix.length - 1;
        int n = 0;
        while (l >= 0 && n <= matrix[0].length - 1) {
            if (matrix[l][n] < target) {
                n++;
            } else if (matrix[l][n] > target) {
                l--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] f = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println("findNumberIn2DArray(f, 5) = " + findNumberIn2DArray(f, 5));
    }
}