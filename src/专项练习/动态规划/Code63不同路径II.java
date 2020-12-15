package 专项练习.动态规划;

/**
 * @author zhang dong
 * @Description https://leetcode-cn.com/problems/unique-paths-ii/
 * @date 2020/12/11-14:01
 */
public class Code63不同路径II {


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //f[i][j]=f[i-1][j]+f[i][j-1];
        //行
        int m = obstacleGrid.length;
        //列
        int n = obstacleGrid[0].length;
        int[][] f = new int[m][n];
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    f[i][j] = 0;
                } else {
                    if (i == 0) {
                        if (j >= 1 && f[i][j - 1] == 0) {
                            f[i][j] = 0;
                        } else {
                            f[i][j] = 1;
                        }
                    } else if (j == 0) {
                        if (i >= 1 && f[i - 1][j] == 0) {
                            f[i][j] = 0;
                        } else {
                            f[i][j] = 1;
                        }
                    } else {
                        f[i][j] = f[i - 1][j] + f[i][j - 1];
                    }
                }
            }
        }
        return f[m - 1][n - 1];
    }
}
