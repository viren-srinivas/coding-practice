package java_solutions.neetcode150.binarySearch;

public class binarySearch {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){
            int m = (l+r)/2;

            if (nums [m] == target)
                return m;

            if(nums[m]<target){
                l = m+1;
            }
            if(nums[m]>target){
                r = m -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new binarySearch().search(new int []{-1,0,3,5,9,12}, 3));
    }
}
