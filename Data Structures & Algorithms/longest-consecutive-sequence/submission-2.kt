class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numsSet = nums.toSet()
        var counter = 0
        for (num in numsSet) {
            if (num-1 !in numsSet) {
                var currentNum = num
                var streak = 0
                
                while(currentNum in numsSet) {
                    currentNum++
                    streak++
                }
                counter = maxOf(counter, streak) 
            }
        }
        return counter
    }
}
