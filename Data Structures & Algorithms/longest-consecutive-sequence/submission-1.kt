class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        nums.sort()
        val numsSet = nums.toSet().toList()
        var counter = 0
        for (num in numsSet) {
            var currentNum = num
            var streak = 0
            
            while(currentNum in numsSet) {
                currentNum++
                streak++
            }
            counter = maxOf(counter, streak) 
        }
        return counter
    }
}
