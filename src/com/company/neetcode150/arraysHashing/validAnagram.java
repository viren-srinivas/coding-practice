package com.company.neetcode150.arraysHashing;

import java.util.HashMap;
import java.util.Map;

public class validAnagram {

    //Could not solve by yourself
//    public boolean isAnagram(String s, String t){
//        if(s.length()!=t.length()){
//            return false;
//        }
//
//        char[] sChar = s.toCharArray();
//        char[] tChar = t.toCharArray();
//
//        for(char c: tChar){
//           if(!(s.contains(c))){
//
//           }
//        }

    public boolean isAnagram(String s, String t){
        Map<Character,Integer> count = new HashMap<>();

        for(char c:s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for(int val:count.values()){
            if(val!=0){
                return false;
            }
        }

        return true;
    }

    public static void main(String [] args){
        System.out.println(new validAnagram().isAnagram("anagram","nagaram"));
    }


}
