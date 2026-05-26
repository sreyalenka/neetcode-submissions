class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numberIndex = HashMap<Int, Int>()
        for ((i, num) in nums.withIndex()) {
            val existingIndex = numberIndex[target - num]
            if (existingIndex != null) {
                return intArrayOf(existingIndex, i)
            }
            numberIndex[num] = i
        }
        return intArrayOf()
    }
}
