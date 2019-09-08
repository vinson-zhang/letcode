package com.vinson.common;

/**
 * ZhangTao
 * 2019/9/1 16:55
 * Description:
 */
public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode getByArray(int[] arr){
        if(arr == null || arr.length <= 0){
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode index = head;
        for(int i = 0; i < arr.length; i++){
            ListNode now = new ListNode(arr[i]);
            index.next = now;
            index = index.next;
        }
        return head.next;
    }

    public static void printListNoe(ListNode listNode){
        if(listNode == null){
            System.out.println();
            return;
        }
        System.out.print(listNode.val + "->");
        printListNoe(listNode.next);
    }

}
