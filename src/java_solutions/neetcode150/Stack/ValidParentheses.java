package java_solutions.neetcode150.Stack;

import java_solutions.neetcode150.Practice;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stackParantheses = new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='('|| c == '{' || c == '[')
                stackParantheses.push(c);
            else{
                if(stackParantheses.isEmpty())
                    return false;
                char last = stackParantheses.pop();
                if (c == ')' && last !='(')
                    return false;
                if (c == ']' && last !='[')
                    return false;
                if (c == '}' && last !='{')
                    return false;
            }
        }
        return stackParantheses.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("{[]}"));
    }
}
