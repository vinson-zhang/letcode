package com.vinson.algorithm.deleteDuplicates;

import com.vinson.common.ListNode;

/**
 * ZhangTao
 * 2019/9/8 14:10
 * Description: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * 删除排序-链表中的重复值
 */
public class DeleteDuplicatesTest {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode index = head;
        while (index != null && index.next != null){
            if(index.val == index.next.val){
                index.next = index.next.next;
            }else {
                index = index.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arry = new int[]{1,1,1,2,2,3};
        ListNode byArray = ListNode.getByArray(arry);
        ListNode.printListNoe(byArray);

        DeleteDuplicatesTest test = new DeleteDuplicatesTest();
        test.deleteDuplicates(byArray);

        ListNode.printListNoe(byArray);

    }

}
