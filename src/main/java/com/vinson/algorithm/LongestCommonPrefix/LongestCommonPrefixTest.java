package com.vinson.algorithm.LongestCommonPrefix;

/**
 * ZhangTao
 * 2019/8/31 20:02
 * Description:
 */
public class LongestCommonPrefixTest {

    public String longestCommonPrefix(String[] strs) {

        StringBuffer stringBuffer = new StringBuffer();
        int j = 0;
        while (true){
            if(strs == null || strs.length <= 0){
                break;
            }
            if(strs[0].length() <= j){
                break;
            }
            stringBuffer.append(strs[0].charAt(j));
            boolean flag = true;
            for(int i = 1; i < strs.length; i++){
                if(strs[i].length() <= j){
                    flag = false;
                    break;
                }
                if(strs[i].charAt(j) != stringBuffer.charAt(stringBuffer.length()-1)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                stringBuffer.deleteCharAt(stringBuffer.length()-1);
                break;
            }
            j++;

        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefixTest test = new LongestCommonPrefixTest();
//        String[] strs = new String[]{"flower","flow","flight"};
//        String[] strs = new String[]{"dog","racecar","car"};
//        String[] strs = new String[]{};
        String[] strs = new String[]{"aaa","aa","aaa"};
        System.out.println(test.longestCommonPrefix(strs));
    }

}
