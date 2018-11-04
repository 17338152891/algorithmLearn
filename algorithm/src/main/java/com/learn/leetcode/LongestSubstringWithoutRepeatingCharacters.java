package com.learn.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "abc"，其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 无重复字符的最长子串是 "b"，其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "wke"，其长度为 3。
 * 请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
 */
public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j = i; j < length; j++) {
                if (!set.contains(chars[j])) {
                    set.add(chars[j]);
                } else {
                    break;
                }
            }
            if (set.size() > max) {
                max = set.size();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int i = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew");
        System.out.println(i);
    }
}
