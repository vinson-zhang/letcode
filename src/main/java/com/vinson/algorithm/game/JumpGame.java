package com.vinson.algorithm.game;

/**
 * @Name: JumpGame
 * @Date: 2020/4/17 20:37
 * @User: Vinson
 * @desc: https://leetcode-cn.com/problems/jump-game/
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int length = nums.length;
        int start = 0;
        for(int i = 0; i < length; i++){
            if(start < i){
                return false;
            }
            start = Math.max(start, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,1,4};
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(arr));
    }




}
