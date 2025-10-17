package java.neetcode150.twoPointers;

import java.util.ArrayList;

public class validPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }

        return sb.toString().contentEquals(sb.reverse());
    }

    public boolean isPalindromeTwoPointers(String s){
        if(s.isEmpty())
            return true;

        int start = 0;
        int end = s.length()-1;

        while(start <= end){
            char firstChar = s.charAt(start);
            char lastChar = s.charAt(end);
            if(!Character.isLetterOrDigit(firstChar))
                start++;
            else if(!Character.isLetterOrDigit(lastChar))
                end--;
            else {
                if (Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)){
                    return false;}
                start++;
                end--;
            }
        }
        return true;
    }

}
