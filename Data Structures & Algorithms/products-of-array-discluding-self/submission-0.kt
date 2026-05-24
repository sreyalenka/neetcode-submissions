class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val output = IntArray(nums.size)
        var product = 1
        for (i in 0 until nums.size) {
            for (j in 0 until nums.size) {
                if (i == j) {
                    continue
                }
                product = product * nums[j]
            }
            output[i] = product
            product = 1
        }
        return output
    }
}
