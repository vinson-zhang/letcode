package com.vinson.algorithm.AddTwoNumbers;

import com.alibaba.fastjson.JSON;

/**
 * ZhangTao
 * 2019/5/26 16:27
 * Description:You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode tempNode = null;
        int tempNum = 0;
        while (true){
            if(l1 == null || l2 ==  null){
                break;
            }
            ListNode newNode = null;
            int val1 = l1.val;
            int val2 = l2.val;
            int sum = val1 + val2 + tempNum;
            if(sum > 9){
                tempNum = sum/10;
                newNode = new ListNode(sum%10);
            }else {
                tempNum = 0;
                newNode = new ListNode(sum);
            }
            if(result == null){
                result = newNode;
            }else {
                tempNode.next = newNode;
            }
            tempNode = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode end = (l1 == null ? l2 : l1);
        while (true){
            if(end == null){
                break;
            }
            ListNode newNode = null;
            int sum = end.val + tempNum;
            if(sum > 9){
                tempNum = sum/10;
                newNode = new ListNode(sum%10);
            }else {
                tempNum = 0;
                newNode = new ListNode(sum);
            }
            if(result == null){
                result = newNode;
            }else {
                tempNode.next = newNode;
            }
            tempNode = newNode;
            end = end.next;
        }
        if(tempNum > 0){
            tempNode.next = new ListNode(tempNum);
        }
        return result;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode a1 = new ListNode(2);
//        ListNode a2 = new ListNode(4);
//        ListNode a3 = new ListNode(3);
//        a1.next = a2;
//        a2.next = a3;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(4);

        b1.next = b2;
        b2.next = b3;


        System.out.println(addTwoNumbers.addTwoNumbers(a1, b1).val);
//        System.out.println(JSON.toJSONString(addTwoNumbers.addTwoNumbers(a1, b1)));

    }

}

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
