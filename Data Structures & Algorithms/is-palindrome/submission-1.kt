class Solution {
    fun isPalindrome(s: String): Boolean {
        val trimmed = s.replace("[^A-Za-z0-9]".toRegex(), "")

        for (i in 0 until trimmed.length/2) {
            if (!trimmed[i].equals(trimmed[(trimmed.length - 1) - i], true)) {
                return false
            }
        }
        return true
    }
}
