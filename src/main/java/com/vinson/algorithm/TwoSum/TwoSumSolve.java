package com.vinson.algorithm.TwoSum;

/**
 * ZhangTao
 * 2019/5/26 16:15
 * Description:
 */
public class TwoSumSolve {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = new int[]{1,3,5,9};
        TwoSumSolve sumSolve = new TwoSumSolve();
        int[] ints = sumSolve.twoSum(temp, 10);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

}
