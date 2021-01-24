import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int size = T.length;
        int[] result = new int[size];
        Stack<Integer> stack = new Stack();

        for(int i = 0; i < size - 1; i++) {
            stack.push(i);
            while (T[stack.peek()] < T[i + 1]) {
                int index = stack.pop();
                result[index] = (i + 1) - index;

                if (stack.isEmpty()) break;
            }
        }
        return result;
    }
}
