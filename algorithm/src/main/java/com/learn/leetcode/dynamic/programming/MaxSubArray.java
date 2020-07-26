package com.learn.leetcode.dynamic.programming;


/**
 * 剑指 Offer 42. 连续子数组的最大和
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 *
 *
 * 示例1:
 *
 * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 *
 * 提示：
 *
 * 1 <= arr.length <= 10^5
 * -100 <= arr[i] <= 100
 * 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/
 *
 */
public class MaxSubArray {
    /**
     *  f[n] = max(f[n-1],f[n])
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums){
        int length = nums.length;
        int[] max = new int[length];
        max[0] = nums[0];
        int maxNum = max[0];
        for(int i = 1;i < length;i++){
            if(max[i - 1] > 0) {
                max[i] = max[i-1] + nums[i];
            }else{
                max[i] = max[i-1];
            }
            if(max[i] > maxNum){
                maxNum = max[i];
            }
        }
        return maxNum;
    }
}
