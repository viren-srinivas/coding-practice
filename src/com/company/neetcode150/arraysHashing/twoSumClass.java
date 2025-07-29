package com.company.neetcode150.arraysHashing;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumClass {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complements = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            Integer complementIndex = complements.get(nums[i]);
            if(complementIndex!=null){
                return new int []{i,complementIndex};
            }
            complements.put(target-nums[i],i);
        }

    return nums;
    }

    public static void main (String [] args){
        System.out.println(Arrays.toString(new twoSumClass().twoSum(new int[]{2, 11,
                7, 15}, 9)));
    }
}
