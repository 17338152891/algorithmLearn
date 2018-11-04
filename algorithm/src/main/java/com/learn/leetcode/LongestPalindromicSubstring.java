package com.learn.leetcode;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。

 示例 1：

 输入: "babad"
 输出: "bab"
 注意: "aba"也是一个有效答案。
 示例 2：

 输入: "cbbd"
 输出: "bb"
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int length = s.length();
        String sum = "";

        for(int i = 0 ; i < length; i++){
            int startIndex = i;
            int endIndex = i;

            while (startIndex >= 0 && endIndex < length&&s.charAt(startIndex) == s.charAt(endIndex)){
             --startIndex;
             ++endIndex;
            }

            if(endIndex - startIndex > sum.length()){
                String sub = s.substring(startIndex+1, endIndex);
                sum = sub;
            }
        }

        for(int i = 1 ; i < length; i++){
            int startIndex = i-1;
            int endIndex = i;
            while (startIndex >= 0 && endIndex < length&&s.charAt(startIndex) == s.charAt(endIndex)){
                --startIndex;
                ++endIndex;
            }

            if(endIndex - startIndex > sum.length()){
                String sub = s.substring(startIndex+1, endIndex);
                sum = sub;
            }
        }

        return sum;

    }

}
