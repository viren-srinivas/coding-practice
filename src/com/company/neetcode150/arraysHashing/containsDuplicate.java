package com.company.neetcode150.arraysHashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    //Solution takes too much time for a large data set
    public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> distinctList = new ArrayList<>();
        for(int no : nums){
            if(!(distinctList.contains(no))){
                distinctList.add(no);
            }else{
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicateCorrect(int [] nums){
        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums){ //O(n)
            if(hashSet.contains(num))
                return true;

            hashSet.add(num);
        }
        return false;
    }

}
