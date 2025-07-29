package com.company.leetcode;

import java.util.HashSet;
import java.util.Set;


public class removeDuplicatesArray {

    public int removeDuplicates(int[] nums) {
        Set<Integer> hashSet = new HashSet<Integer>();

        for(int num : nums){
            hashSet.add(num);
        }
        return hashSet.stream().
                        mapToInt(Integer::intValue).toArray().length;
    }
    public static void main(String[] args) {
        removeDuplicatesArray removeDuplicatesArray = new removeDuplicatesArray();
        int[] nums = {1,1,2,2,3,3,4,4,5,5};
        int result = removeDuplicatesArray.removeDuplicates(nums);
        System.out.println("Array length: " + result);
    }
}
