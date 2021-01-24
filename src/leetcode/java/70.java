class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1, tmp;

        // n번째 피보나치 수 구하기
        // 근데 왜 피보나치 수가 되는지는 모르겠음..
        for (int i = 1; i < n; i++) {
            tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
