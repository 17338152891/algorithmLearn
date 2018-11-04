package com.learn;

import com.learn.leetcode.StringToInteger;
import org.junit.Test;

public class TestStringToInteger {

    @Test
    public void testMyAtoi(){
        int i = new StringToInteger().myAtoi("12adfjak");
        System.out.println(i);
    }
}
