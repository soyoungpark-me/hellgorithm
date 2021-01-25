package leetcode.easy

/*
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 */
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val length = strs.size
        return when {
            length < 1 -> ""
            length == 1 -> strs[0]
            else -> {
                // 각 문자열의 앞글자를 하나씩 비교한다.
                var i = 0
                var prefix = ""
                for (j in 1 until length) {
                    while (strs[j].length < i++ ) {
                        val ch = strs[0][i]
                        if (ch != strs[j][i]) {
                            return prefix
                        }
                        else {
                            prefix += ch
                        }
                    }
                }
                return prefix
            }
        }
    }
}

fun main() {
    val solution = Solution()
    println(solution.longestCommonPrefix(listOf("flower", "flow", "flight").toTypedArray()))
}