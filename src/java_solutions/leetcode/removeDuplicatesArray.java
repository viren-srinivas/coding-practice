package java_solutions.leetcode;

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
}
