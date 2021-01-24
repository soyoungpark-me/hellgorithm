package leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // TODO String 안쓰고 푸는건 미래의 내가 할거야
        String str = Integer.toString(x);
        int length = str.length();
        int round = length / 2;

        // 받은 숫자를 좌우를 시작으로 안으로 들어오면서 비교한다.
        for (int i = 0; i < round; i++) {
            if (str.charAt(i) != str.charAt(length - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
