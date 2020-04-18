package com.vinson.util;


import java.util.Random;

public class CommonUtil {

    /**
     * 生成指定长度的随机数组
     * @param len
     * @param min
     * @param max
     * @return
     */
    public static Integer[] getRamdomArr(int len, int min, int max){
        Integer[] arr = new Integer[len];
        for(int i = 0; i < len; i++){
            int randomInt =  (min + (int)(Math.random() * (max - min)));
            arr[i] = randomInt;
        }
        return arr;
    }

    /**
     * 获取int 类型随机数组
     * @param len
     * @param min
     * @param max
     * @return
     */
    public static int[] getRandomArrInt(int len, int min, int max){
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            int randomInt =  (min + (int)(Math.random() * (max - min)));
            arr[i] = randomInt;
        }
        return arr;
    }

}
