package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) return false;
        Stack stack = new Stack();

        // 왼쪽 괄호면 스택에 넣고, 오른쪽 괄호면 스택에서 뺀다음에 합이 맞는지 비교하는데..
        // TODO 뭔가 간결하게 쓰고싶다
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
