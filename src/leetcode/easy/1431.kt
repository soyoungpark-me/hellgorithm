/*
 * Kids With the Greatest Number Of Candies
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
    val max = candies.max()!!
    return BooleanArray(candies.size).apply {
        candies.mapIndexed { index, i -> this[index] = i + extraCandies >= max }
    }
}