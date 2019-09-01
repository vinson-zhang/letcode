package com.vinson.algorithm.DeleteNodeInLinkedList;

import com.vinson.common.ListNode;

/**
 * ZhangTao
 * 2019/9/1 16:54
 * Description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/solution/shan-chu-lian-biao-zhong-de-jie-dian-by-leetcode/
 */
public class DeleteNodeInLinkedListTest {


    public void deleteNode(ListNode node) {
        if(node == null){
            return;
        }
        if(node.next == null){
            node = null;
        }else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }


}
