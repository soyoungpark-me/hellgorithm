package leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int strCount = strs.length;
        if (strCount < 1) return "";
        if (strCount == 1) return strs[0];

        // StringBuilder prefix = new StringBuilder();
        // 이 문제에서는 StringBuilder가 메모리를 더 먹는다,,
        String prefix = "";

        int shortest = strs[0].length();
        for (String str : strs) {
            if (str.length() < shortest) {
                shortest = str.length();
            }
        }

        for (int i = 0; i < shortest; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strCount; j++) {
                if (ch != strs[j].charAt(i)) {
                    return prefix;
                }
                if (j == strCount - 1) {
                    prefix += ch;
                }
            }
        }
        return prefix;
    }
}
