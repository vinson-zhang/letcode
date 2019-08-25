package com.vinson.algorithm.ReverseInteger;

/**
 * ZhangTao
 * 2019/8/25 13:02
 * Description:
 */
public class ReverseIntegerTest {


    public int reverse(int x) {
//        int result = 0;
//        boolean flag = false;
//        if(x < 0){
//            flag = true;
//            x = x * -1;
//        }
//
//        while (x > 0){
//            result = result * 10 + x % 10;
//            x = x /10;
//        }
//        return flag ?  -1*result : result;
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }


    public static void main(String[] args) {
        ReverseIntegerTest reverseIntegerTest = new ReverseIntegerTest();
        System.out.println(reverseIntegerTest.reverse(213));
    }


}
