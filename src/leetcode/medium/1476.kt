/*
 * 1476. Subrectangle Queries
 * https://leetcode.com/problems/subrectangle-queries/
 */
class SubrectangleQueries(val rectangle: Array<IntArray>) {

    private val flat: IntArray = rectangle.flatMap { it.asIterable() }.toIntArray()

    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        val wide = this.rectangle[0].size
        for (i in 0 .. (row2 - row1)) {
            for (j in 0 .. (col2 - col1)) {
                flat[wide * (row1 + i) + (col1 + j)] = newValue
            }
        }
    }

    fun getValue(row: Int, col: Int): Int {
        return flat[row * this.rectangle[0].size + col]
    }

}