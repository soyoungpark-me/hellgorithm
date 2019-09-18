package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) return false;
        Stack stack = new Stack();

        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (stack.empty() || (char) stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.empty() || (char) stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.empty() || (char) stack.pop() != '[') return false;
            }
        }
        return stack.empty();
    }
}
