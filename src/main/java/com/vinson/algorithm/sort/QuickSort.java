package com.vinson.algorithm.sort;

import com.alibaba.fastjson.JSON;
import com.vinson.util.CommonUtil;

/**
 * @Name: QuickSort
 * @Date: 2019/12/22 17:39
 * @User: Vinson
 * @desc:
 */
public class QuickSort {


    public Integer[] sort(Integer arr){

        return new Integer[]{};
    }



    public static void main(String[] args) {
        QuickSort test = new QuickSort();
        Integer[] ramdomArr = CommonUtil.getRamdomArr(20, 1, 30);
        System.out.println("原始数组："+JSON.toJSONString(ramdomArr));
//        System.out.println("排序后的数组：" + JSON.toJSONString(test.sort(ramdomArr)));
    }


}
