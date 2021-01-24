class Solution {
    public String longestCommonPrefix(String[] strs) {
        int strCount = strs.length;
        if (strCount < 1) return "";
        if (strCount == 1) return strs[0];

        // StringBuilder prefix = new StringBuilder();
        // 이 문제에서는 StringBuilder가 메모리를 더 먹는다,,
        String prefix = "";

        // 제일 짧은 문자열의 길이를 구한다.
        int shortest = strs[0].length();
        for (String str : strs) {
            if (str.length() < shortest) {
                shortest = str.length();
            }
        }

        // 제일 짧은 문자열의 길이만큼, 각 문자열의 앞글자를 하나씩 비교한다.
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
