package com.vinson.algorithm.ContainerWithMostWater;

/**
 * ZhangTao
 * 2019/9/1 16:21
 * Description:https://leetcode-cn.com/problems/container-with-most-water/
 */
public class ContainerWithMostWaterTest {

    /**
     * 暴力法
     * @param height
     * @return
     */
    public int maxArea2(int[] height) {
        if(height == null || height.length < 2){
            return 0;
        }
        int total = 0;
        for(int i = 0; i < height.length; i++){
            for(int j = i +1; j < height.length; j++){
                int tempTotal = (j - i) * (height[i] > height[j] ? height[j] : height[i]);
                total = total > tempTotal ? total : tempTotal;
            }
        }
        return total;
    }

    /**
     * 双指针方法, area = min(h[i] , h[j]) * (j - i)
     * 其实，当挪动的时候，j - i 这个整体的变量一定的是减小的， 且变动幅度都是1,
     * 则，决定最终值就在，h[i] 和 h[j] 这里了
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        if(height == null || height.length < 2){
            return 0;
        }
        int max = 0;
        for(int i = 0, j = height.length-1; i != j;){
            int area = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(area, max);
            if(height[i] > height[j]){
                j--;
            }else {
                i++;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] param = new int[]{1,8,6,2,5,4,8,3,7};
        ContainerWithMostWaterTest test = new ContainerWithMostWaterTest();
        System.out.println(test.maxArea(param));
    }
}
