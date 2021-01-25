/*
 * 1480. Running Sum of 1d Array
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
fun runningSum(nums: IntArray): IntArray {
    return IntArray(nums.size).apply {
        var num = nums[0]
        this[0] = num
        for (i in 1 until nums.size) {
            num += nums[i]
            this[i] = num
        }
    }
}