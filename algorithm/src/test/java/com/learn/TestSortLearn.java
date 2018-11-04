package com.learn;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestSortLearn {
    List<Integer> datas = null;


    @Before
    public void init(){
        Random random = new Random();
        datas = new LinkedList<Integer>();
        for(int i = 0; i < 10; i++){
            datas.add(random.nextInt(10));
        }
        //System.out.println(datas);
    }

    @Test
    public void testSortByQ() {
        long start = System.currentTimeMillis();
        List<Integer> res = SortLearn.sortByQ(datas);
        long end = System.currentTimeMillis();
        System.out.println("q ---> " + (end - start));
        //System.out.println(res);
    }

    @Test
    public void testSortByM() {
        long start = System.currentTimeMillis();
        List<Integer> res = SortLearn.sortByM(datas);
        long end = System.currentTimeMillis();
        System.out.println("m ---> " + (end - start));
        //System.out.println(res);
    }

    @Test
    public void testSortByG() {
        long start = System.currentTimeMillis();
        List<Integer> res = SortLearn.sortByG(datas);
        long end = System.currentTimeMillis();
        System.out.println("g ---> " + (end - start));

    }

    @Test
    public void testSortByJ() {
        long start = System.currentTimeMillis();
        Collections.sort(datas);
        long end = System.currentTimeMillis();
        System.out.println("j ---> " + (end - start));
        //System.out.println(res);
    }

    @Test
    public void testSortByInsert(){
        System.out.println(datas);
        long start = System.currentTimeMillis();
        List<Integer> res = SortLearn.sortInsert(datas);
        long end = System.currentTimeMillis();
        System.out.println("i ---> " + (end - start));
        System.out.println(res);
    }

}
