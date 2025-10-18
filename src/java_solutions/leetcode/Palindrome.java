package java_solutions.leetcode;

public class Palindrome {
    public static boolean isPalindrome(int x) {

        String val = Integer.toString(x);
        StringBuilder pali = new StringBuilder();
        int n = 0;
        if(val.charAt(0)=='-'){
            return false;
        }else{
            do{
                n = x % 10;
                pali.append(n);
                x = x/10;
            }while(x!=0);
        }

        return val.contentEquals(pali);
    }
}
