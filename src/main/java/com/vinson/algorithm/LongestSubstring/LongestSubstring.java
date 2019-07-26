package com.vinson.algorithm.LongestSubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * ZhangTao
 * 2019/5/26 17:26
 * Description: Longest Substring Without Repeating Characters
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        if(s == null){
            return maxLen;
        }
        for (int i = 0; i < s.length(); i++){
            Set<Character> temp = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                int prelen = temp.size();
                temp.add(s.charAt(j));
                int afterlen = temp.size();
                if(afterlen == prelen || j == s.length()-1){
                    maxLen = afterlen > maxLen ? afterlen : maxLen;
                    if(j != s.length() - 1){
                        i = j- maxLen;
                    }
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();

        System.out.println(longestSubstring.lengthOfLongestSubstring("abcabcbb"));
    }
}
