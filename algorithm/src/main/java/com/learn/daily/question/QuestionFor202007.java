package com.learn.daily.question;

import java.util.Arrays;
import java.util.Collections;

public class QuestionFor202007 {
    public static void main(String[] args) {

    }
}


/**
 *
 * 410. 分割数组的最大值
 * 给定一个非负整数数组和一个整数 m，你需要将这个数组分成 m 个非空的连续子数组。设计一个算法使得这 m 个子数组各自和的最大值最小。
 *
 * 注意:
 * 数组长度 n 满足以下条件:
 *
 * 1 ≤ n ≤ 1000
 * 1 ≤ m ≤ min(50, n)
 * 示例:
 *
 * 输入:
 * nums = [7,2,5,10,8]
 * m = 2
 *
 * 输出:
 * 18
 *
 * 解释:
 * 一共有四种方法将nums分割为2个子数组。
 * 其中最好的方式是将其分为[7,2,5] 和 [10,8]，
 * 因为此时这两个子数组各自的和的最大值为18，在所有情况中最小。
 */
class SolutionFor20200725 {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        int[][] f = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(f[i], Integer.MAX_VALUE);
        }
        int[] sub = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sub[i + 1] = sub[i] + nums[i];
        }
        f[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, m); j++) {
                for (int k = 0; k < i; k++) {
                    f[i][j] = Math.min(f[i][j], Math.max(f[k][j - 1], sub[i] - sub[k]));
                }
            }
        }
        return f[n][m];
    }
}

/**
 * 329. 矩阵中的最长递增路径
 * 给定一个整数矩阵，找出最长递增路径的长度。
 *
 * 对于每个单元格，你可以往上，下，左，右四个方向移动。 你不能在对角线方向上移动或移动到边界外（即不允许环绕）。
 *
 * 示例 1:
 *
 * 输入: nums =
 * [
 *   [9,9,4],
 *   [6,6,8],
 *   [2,1,1]
 * ]
 * 输出: 4
 * 解释: 最长递增路径为 [1, 2, 6, 9]。
 * 示例 2:
 *
 * 输入: nums =
 * [
 *   [3,4,5],
 *   [3,2,6],
 *   [2,2,1]
 * ]
 * 输出: 4
 * 解释: 最长递增路径是 [3, 4, 5, 6]。注意不允许在对角线方向上移动。
 * 通过次数17,525提交次数41,691
 */
class SolutionFor20200726 {
    public int longestIncreasingPath(int[][] matrix) {
        int li = matrix.length;
        if(li == 0){
            return 0;
        }
        int lj = matrix[0].length;
        if(lj == 0){
            return 0;
        }
        int[][] res = new int[li][lj];
        for (int i = 0; i < li; i++) {
            int[] resx = new int[lj];
            Arrays.fill(resx, -1);
            res[i] = resx;
        }
        int max = 0;
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < lj; j++) {
                getLength(res, matrix, i, j);
                if(res[i][j] > max){
                    max = res[i][j];
                }
            }
        }
        return max;
    }

    public void getLength(int[][] res, int[][] matrix, int i , int j){
        if(res[i][j] != -1){
            return;
        }
        int li = matrix.length;
        int lj = matrix[0].length;
        int ij = res[i][j];
        int up = 1, down = 1, left = 1, reght = 1;
        if (i != 0 && matrix[i][j] < matrix[i-1][j]) {
            getLength(res, matrix, i - 1, j);
            up = res[i -1][j] + 1;
        }
        if (i != li - 1 &&  matrix[i][j] < matrix[i+1][j]) {
            getLength(res, matrix, i + 1, j);
            down = res[i + 1][j] + 1;
        }
        if (j != 0 &&  matrix[i][j] < matrix[i][j-1]) {
            getLength(res, matrix, i, j-1);
            left = res[i][j-1] + 1;
        }
        if (j != lj - 1 &&  matrix[i][j] < matrix[i][j+1]) {
            getLength(res, matrix, i, j+1);
            reght = res[i][j+1] + 1;
        }
        res[i][j] = Collections.max(Arrays.asList(up, down, left, reght));
    }
}