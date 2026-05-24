class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.sort()
        for (num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1 
        }
        
        val sortedMap = map
            .entries
            .sortedByDescending { it.value }
            .associate { it.toPair() }
        
        return sortedMap.keys.take(k).toIntArray()
    }
}
