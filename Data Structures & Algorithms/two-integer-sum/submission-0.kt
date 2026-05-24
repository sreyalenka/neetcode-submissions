class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val list = nums
        var matchingItem: IntArray? = null
        for((i, num1) in list.withIndex()) {
            for(j in i+1 until list.size) {
                if ((num1 + list[j]) == target) {
                    matchingItem = intArrayOf(i, j)
                    break
                }
            }
        }
        return matchingItem ?: intArrayOf()
    }
}
