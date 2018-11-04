package com.learn.leetcode;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。

 你可以假设除了数字 0 之外，这两个数字都不会以零开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curentL1 = l1;
        ListNode curentL2 = l2;
        int isJinwei = 0;

        ListNode res = new ListNode(0);
        ListNode curentSum = res;
        while (isJinwei ==1 || curentL1 != null && curentL2 != null) {
            int valL1 = 0, valL2 = 0;
            if(curentL1 != null){
                valL1 = curentL1.val;
                curentL1 = curentL1.next;
            }

            if(curentL2 != null){
                valL2 = curentL2.val;
                curentL2 = curentL2.next;
            }

            int sum = valL1 + valL2 + isJinwei;
            if(sum >= 10){
                isJinwei = 1;
                sum %= 10;
            }else {
                isJinwei = 0;
            }

            ListNode sumNode = new ListNode(sum);
            curentSum.next = sumNode;
            curentSum = sumNode;
        }
        return res.next;
    }



}


