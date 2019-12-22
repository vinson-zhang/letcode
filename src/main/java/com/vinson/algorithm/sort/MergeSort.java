package com.vinson.algorithm.sort;

import com.alibaba.fastjson.JSON;
import com.vinson.util.CommonUtil;

import java.util.Arrays;

/**
 * 归并排序
 */
public class MergeSort {


    public Integer[] sort(Integer[] arr){
        Integer[] sortArr = Arrays.copyOf(arr, arr.length);

        if(sortArr.length <= 1){
            return sortArr;
        }
        Integer[] left = Arrays.copyOfRange(sortArr, 0,sortArr.length/2);
        Integer[] right = Arrays.copyOfRange(sortArr, sortArr.length/2, sortArr.length);

        return merge(sort(left), sort(right));
    }

    public Integer[] merge(Integer[] left, Integer[] right){
        Integer[] result = new Integer[left.length + right.length];
        int i = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                result[i] = left[leftIndex++];

            }else {
                result[i] = right[rightIndex++];
            }
            i++;
        }
        while (leftIndex < left.length){
            result[i++] = left[leftIndex++];
        }

        while (rightIndex < right.length){
            result[i++] = right[rightIndex++];
        }

        return result;
    }




    public static void main(String[] args) {
        MergeSort test = new MergeSort();
        Integer[] ramdomArr = CommonUtil.getRamdomArr(20, 1, 30);
        System.out.println("原始数组："+JSON.toJSONString(ramdomArr));
        System.out.println("排序后的数组：" + JSON.toJSONString(test.sort(ramdomArr)));
    }

}
