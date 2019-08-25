package com.vinson.algorithm.PalindromeNumber;

/**
 * ZhangTao
 * 2019/8/25 15:55
 * Description:
 */
public class PalindromeNumberTest {

//    public boolean isPalindrome(int x) {
//        if(x < 0){
//            return false;
//        }
//        String xStr = String.valueOf(x);
//        StringBuffer stringBuffer = new StringBuffer();
//        for(int i = 0; i < xStr.length(); i++){
//            stringBuffer.append(xStr.charAt(xStr.length() -1 - i));
//        }
//        return stringBuffer.toString().equals(xStr);
//    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int length = 0;
        int temp = x;
        while (temp > 0) {
            temp = temp / 10;
            length++;
        }
        boolean flag = length % 2 == 0;
        int mid = length / 2;
        int left = 0;
        int right = 0;

        int tempX = x;
        for (int i = 0; i < length; i++) {
            if (!flag && i == mid) {
                left = tempX / 10;
                break;
            }
            int pop = tempX % 10;
            tempX = tempX / 10;
            right = right * 10 + pop;
            if (flag && i + 1 == mid) {
                left = tempX;
                break;
            }


        }
        return left == right;
    }


    public static void main(String[] args) {
        PalindromeNumberTest test = new PalindromeNumberTest();
        System.out.println(test.isPalindrome(1));
    }
}
