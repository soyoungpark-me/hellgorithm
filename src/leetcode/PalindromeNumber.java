package leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // TODO String 안쓰고 푸는건 미래의 내가 할거야
        String str = Integer.toString(x);
        int length = str.length();
        int round = length / 2;

        for (int i = 0; i < round; i++) {
            if (str.charAt(i) != str.charAt(length - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
