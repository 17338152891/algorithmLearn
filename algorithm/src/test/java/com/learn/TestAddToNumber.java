package com.learn;

import com.learn.leetcode.AddTwoNumbers;
import com.learn.leetcode.ListNode;
import org.junit.Test;

public class TestAddToNumber {


    @Test
    public void testAddTwoNumbers(){

        ListNode l1_1 = new ListNode(9);



        ListNode l2_8 = new ListNode(9);
        ListNode l2_7 = new ListNode(9);
        ListNode l2_6 = new ListNode(9);
        ListNode l2_5 = new ListNode(9);
        ListNode l2_4 = new ListNode(9);
        ListNode l2_3 = new ListNode(9);
        ListNode l2_2 = new ListNode(9);
        ListNode l2_1 = new ListNode(1);
        l2_1.next = l2_2;
        l2_2.next = l2_3;
        l2_3.next = l2_4;
        l2_4.next = l2_5;
        l2_5.next = l2_6;
        l2_6.next = l2_7;
        l2_7.next = l2_8;


        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1_1, l2_1);

        System.out.println(listNode.val);
        ListNode next1 = listNode.next;
        System.out.println(next1.val);
        ListNode next2 = next1.next;
        System.out.println(next1.val);
        ListNode next3 = next2.next;
        System.out.println(next3.val);
        ListNode next4 = next3.next;
        System.out.println(next4.val);
        ListNode next5 = next4.next;
        System.out.println(next5.val);
        ListNode next6 = next5.next;
        System.out.println(next6.val);
        ListNode next7 = next6.next;
        System.out.println(next7.val);
        ListNode next8 = next7.next;
        System.out.println(next8.val);
       // ListNode next9 = next8.next;
       // System.out.println(next9.val);

    }
}
