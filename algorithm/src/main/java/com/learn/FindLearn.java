package com.learn;

import java.util.*;

/**
 * 查找类算法学习
 */
public class FindLearn {

    public static int findNum(int[] datas, int target){
        return findNum(datas, target, 0, datas.length);
    }

    public static int findNum(int[] datas, int target, int startIndex, int endIndex){
        int lengthMiddle = (startIndex + endIndex)/2;
        int data = datas[lengthMiddle];
        if(target == data){
            return lengthMiddle;
        }
        if(target < data){
            return findNum(datas, target,0, lengthMiddle);
        }else {
            return findNum(datas, target, lengthMiddle, endIndex);
        }
    }

    public static int findNumFor(int[] datas, int target){
        int length = datas.length;
        for(int i = 0; i < length; i++){
           if(datas[i] == target){
               return i;
           }
        }
        return 0;
    }

    public static int findNumForTree(){
        return 0;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(6);
        set.add(11);
        set.add(10);
        set.add(9);
        set.add(91);
        set.add(39);
        System.out.println(set);

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(set);
        System.out.println(queue.add(100));
        System.out.println(queue.add(1));
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());


    }
}
