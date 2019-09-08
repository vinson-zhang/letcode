package com.vinson.algorithm.hasCycle;

import com.vinson.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * ZhangTao
 * 2019/9/8 14:31
 * Description: 判断是否有环形，链表中
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class HasCycleTest {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null){
            int sizeBefore = nodeSet.size();
            nodeSet.add(head);
            if(nodeSet.size() == sizeBefore){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /**
     * 双指针 - 快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
           if(fast.next == null || fast.next.next == null){
               return false;
           }
           slow = slow.next;
           fast = fast.next.next;
        }
        return true;
    }

}
