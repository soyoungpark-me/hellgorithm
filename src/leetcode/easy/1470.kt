/*
 * 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/
 */
fun shuffle(nums: IntArray, n: Int): IntArray {
    return IntArray(n * 2).apply {
        for (i in 0 until n) {
            this[2 * i] = nums[i]
            this[2 * i + 1] = nums[i + n]
        }
    }
}