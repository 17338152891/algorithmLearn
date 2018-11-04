package com.learn;

import com.learn.leetcode.ZigZagConversion;
import org.junit.Assert;
import org.junit.Test;

public class TestZigZagConversion {

    @Test
    public void testConrer(){
        String paypalishiring = new ZigZagConversion().convert("PAYPALISHIRING", 3);
        Assert.assertEquals(paypalishiring, "PAHNAPLSIIGYIR");
    }


    @Test
    public void testConrer1(){
        String paypalishiring = new ZigZagConversion().convert("PAYPALISHIRING", 4);
        Assert.assertEquals(paypalishiring, "PINALSIGYAHRPI");
    }

    @Test
    public void testConrer2(){
        String paypalishiring = new ZigZagConversion().convert("AB", 1);
        Assert.assertEquals(paypalishiring, "AB");
    }

}
