class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val sumList = mutableListOf<List<Int>>()
        nums.sort()
        for (i in 0 until nums.size - 2) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            var first = i
            var second = i+1
            var third = nums.lastIndex

            while(second<third) {
                val sum = nums[first]+nums[second]+nums[third]

                when {
                    sum == 0 -> {
                        val triplet = listOf(nums[first],nums[second],nums[third])
                        if (!sumList.contains(triplet)) {
                            sumList.add(triplet)
                        }
                        second++
                        third--
                    }
                    sum < 0 -> second++
                    else -> third--
                }
            }
        }
        return sumList
    }
}
