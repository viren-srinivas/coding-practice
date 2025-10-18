package java_solutions.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class ValidParantheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        Character [] opening = {'(', '{', '['};
        Character [] closing = {')', '}', ']'};

        for (int i = 0; i < s.length(); i++) {
            if (Arrays.asList(opening).contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (Arrays.asList(closing).contains(s.charAt(i))) {
                if(stack.size()==0){
                    return false;
                }else {
                    switch (s.charAt(i)) {
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                            } else
                                return false;
                            break;
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                            } else
                                return false;
                            break;
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                            } else
                                return false;
                            break;

                    }
                }
            }
        }
        if(stack.size()==0)
            return true;
        else
            return false;
    }
}



