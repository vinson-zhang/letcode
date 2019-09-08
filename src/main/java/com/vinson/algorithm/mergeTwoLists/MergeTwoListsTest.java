package com.vinson.algorithm.mergeTwoLists;

import com.vinson.common.ListNode;

/**
 * ZhangTao
 * 2019/9/7 21:29
 * Description: 合并两个有序链表 https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoListsTest {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1 == null || l2 == null){
           return l1 == null ? l2 : l1;
       }


       ListNode result = new ListNode(0);
       ListNode index = result;
       while (l1 != null && l2 != null){
           if(l1.val < l2.val){
               index.next = l1;
               l1 = l1.next;
               index = index.next;
           }else if(l1.val == l2.val){
               index.next = l1;
               l1 = l1.next;
               index = index.next;

               index.next = l2;
               l2 = l2.next;
               index = index.next;
           }else {
               index.next = l2;
               l2 = l2.next;
               index = index.next;
           }
       }

       index.next = l1 == null ? l2 : l1;

       return result.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {

        int[] aArray = new int[]{1,2, 4};
        int[] bArray = new int[]{1,3, 4};

        ListNode aListNode = ListNode.getByArray(aArray);
        ListNode bListNode = ListNode.getByArray(bArray);

        ListNode.printListNoe(aListNode);
        ListNode.printListNoe(bListNode);

        MergeTwoListsTest twoListsTest = new MergeTwoListsTest();
        ListNode listNode = twoListsTest.mergeTwoLists2(aListNode, bListNode);
//        ListNode listNode = twoListsTest.mergeTwoLists(aListNode, bListNode);

        ListNode.printListNoe(listNode);

    }

}
