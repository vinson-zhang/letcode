package com.vinson.algorithm.simple;

import com.alibaba.fastjson.JSON;
import com.vinson.util.CommonUtil;

/**
 * @Name: RemoveDuplicates_26
 * @Date: 2020/4/18 20:05
 * @User: Vinson
 * @desc: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates_26 {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length <=1){
            return length;
        }
        int i = 0;
        for(int j = 1; j < length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] ramdomArr = CommonUtil.getSortRandomArrInt(10, 5, 10);
        System.out.println(JSON.toJSONString(ramdomArr));
        RemoveDuplicates_26 RemoveDuplicates_26 = new RemoveDuplicates_26();
        System.out.println(RemoveDuplicates_26.removeDuplicates(ramdomArr));
        System.out.println(JSON.toJSONString(ramdomArr));
    }

}
