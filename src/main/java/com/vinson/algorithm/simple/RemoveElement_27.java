package com.vinson.algorithm.simple;

import com.alibaba.fastjson.JSON;
import com.vinson.util.CommonUtil;

/**
 * @Name: RemoveElement_27
 * @Date: 2020/4/18 19:35
 * @User: Vinson
 * @desc: https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for(int i = len - 1; i >= 0; i--){
            if(nums[i] == val){
                len--;
                if(i != len){
                    nums[i] = nums[len];
                }
            }
        }
        return len;
    }

    public int removeElement2(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] ramdomArr = CommonUtil.getRandomArrInt(10, 5, 10);
        System.out.println(JSON.toJSONString(ramdomArr));
        RemoveElement_27 removeElement_27 = new RemoveElement_27();
        System.out.println(removeElement_27.removeElement2(ramdomArr, 6));
        System.out.println(JSON.toJSONString(ramdomArr));
    }
}
