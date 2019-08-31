package com.vinson.algorithm.RomanToInteger;

/**
 * ZhangTao
 * 2019/8/25 17:14
 * Description: https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToIntegerTest {

    public int romanToInt(String s) {

        int total = 0;
        int lastNum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int num = getByString(c);

            if(num <= lastNum){
                total = total + num;
            }else {
                total = total - lastNum + num - lastNum;
            }
            lastNum = num;
        }
        return total;
    }

    private int getByString(Character str){
        int num = 0;
        switch (str){
            case 'I':  num = 1;break;
            case 'V': num = 5;break;
            case 'X': num = 10;break;
            case 'L': num = 50;break;
            case 'C': num = 100;break;
            case 'D': num = 500;break;
            case 'M': num = 1000;break;
            default:num = 0;break;
        }
        return num;
    }

    public static void main(String[] args) {
        RomanToIntegerTest test = new RomanToIntegerTest();
        System.out.println(test.romanToInt("III"));
        System.out.println(test.romanToInt("IV"));
        System.out.println(test.romanToInt("IX"));
        System.out.println(test.romanToInt("LVIII"));
        System.out.println(test.romanToInt("MCMXCIV"));

    }

}
