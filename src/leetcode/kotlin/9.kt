/*
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */
fun isPalindrome(x: Int): Boolean {
    val str = x.toString()
    val length = str.length
    val round = length / 2

    // 받은 숫자를 좌우를 시작으로 안으로 들어오면서 비교한다.
    for (i in 0 until round) {
        if (str[i] != str[length - (i + 1)]) {
            return false
        }
    }
    return true
}