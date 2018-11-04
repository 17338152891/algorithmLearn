package com.learn;

import org.junit.Before;
import org.junit.Test;

/**
 * 测试查找类算法
 */
public class TestFindLearn {

    int[] datas = null;

    @Before
    public void init(){
        int length = 1100000000;
        datas = new int[length];
        for(int i = 0 ;i < length; i++){
            datas[i] = i + 1;
        }
    }


    @Test
    public void testFindNum(){
        long start = System.currentTimeMillis();
        int num = FindLearn.findNum(datas, 999999990);
        long end = System.currentTimeMillis();
        System.out.println("erfen ---> " + (end - start));
        System.out.println(num);
    }


    @Test
    public void testFindNumFor(){
        long start = System.currentTimeMillis();
        int num = FindLearn.findNumFor(datas, 999999990);
        long end = System.currentTimeMillis();
        System.out.println("for ---> " + (end - start));
        System.out.println(num);
    }


}
