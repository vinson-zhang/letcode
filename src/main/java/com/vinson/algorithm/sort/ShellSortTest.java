package com.vinson.algorithm.sort;

import com.alibaba.fastjson.JSON;
import com.vinson.util.CommonUtil;

public class ShellSortTest {


    public Integer[] shellSort(Integer[] arr){

        for (int incr = arr.length/2; incr > 0; incr/=2) {
            for (int i = incr; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];

                // j - step 就是代表与它同组隔壁的元素
                while (j - incr >= 0 && arr[j - incr] > temp) {
                    arr[j] = arr[j - incr];
                    j = j - incr;
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ShellSortTest test = new ShellSortTest();
        Integer[] ramdomArr = CommonUtil.getRamdomArr(20, 1, 30);
        System.out.println("原始数组："+JSON.toJSONString(ramdomArr));
        System.out.println("排序后的数组：" + JSON.toJSONString(test.shellSort(ramdomArr)));
    }

}
