package com.company.leetcode;

import java.util.Arrays;

public class longCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
//    Attempt #1
//    public String longestCommonPrefix(String[] strs) {
//        boolean stop = false;
//        boolean found = false;
//        int cnt = 0;
//        char temp = 0;
//        StringBuilder str = new StringBuilder();
//
//        if(strs.length==1){
//            return strs[0];
//        }
//        do {
//            for (int i=0;i<strs.length-1;i++) {
//                if(strs[i].equals("")){
//                    return "";
//                }
//                if (strs[i].charAt(cnt) == strs[i + 1].charAt(cnt)) {
//                    temp = strs[i].charAt(cnt);
//                    found = true;
//                } else {
//                    found = false;
//                    break;
//                }
//            }
//            if(found == true){
//                str.append(temp);
//            } else {
//                stop = true;
//            }
//            cnt ++;
//        }while(stop!=true);
//
//        return str.toString();
//    }

    public static void main(String [] args){
        System.out.println(new longCommonPrefix().longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
