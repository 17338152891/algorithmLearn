package com.learn;

import com.learn.leetcode.LongestPalindromicSubstring;
import org.junit.Assert;
import org.junit.Test;

public class TestLongestPalindromicSubstring {

    @Test
    public void testLongestPalindrome0(){
        String aa = new LongestPalindromicSubstring().longestPalindrome("aa");
        //System.out.println("aa".substring(0,2));
        Assert.assertEquals("aa", aa);
    }

    @Test
    public void testLongestPalindrome1(){
        String aa = new LongestPalindromicSubstring().longestPalindrome("aab");
        Assert.assertEquals("aa", aa);
    }

    @Test
    public void testLongestPalindrome2(){
        String aa = new LongestPalindromicSubstring().longestPalindrome("baa");
        Assert.assertEquals("aa", aa);
    }
    @Test
    public void testLongestPalindrome3(){
        String aa = new LongestPalindromicSubstring().longestPalindrome("baabaa");
        Assert.assertEquals("aabaa", aa);
    }

    @Test
    public void testLongestPalindrome5(){
        String aa = new LongestPalindromicSubstring().longestPalindrome("baabaabaa");
        Assert.assertEquals("aabaabaa", aa);
    }

    @Test
    public void testLongestPalindrome4(){
        String aa = new LongestPalindromicSubstring().longestPalindrome("a");
        Assert.assertEquals("a", aa);
    }
}
