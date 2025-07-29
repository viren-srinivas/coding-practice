package com.company.neetcode150.arraysHashing;

import java.util.*;

public class Practice{

    public int[] TwoSum(int nums[], int target){
        Map<Integer,Integer> complementTable = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            Integer complementIndex = complementTable.get(nums[i]);

            if(complementIndex !=null){
                return new int[]{complementIndex,i};
            }
            complementTable.put(target-nums[i],i);
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Practice().TwoSum(new int[]{2,11,7,15},9)));
    }
}
