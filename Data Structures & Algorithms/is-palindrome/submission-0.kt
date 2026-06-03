class Solution {
    fun isPalindrome(s: String): Boolean {
        val trimmed = s.replace("[^A-Za-z0-9]".toRegex(), "")

        for (i in 0 until trimmed.length/2) {
            val startchar = trimmed[i]
            val endchar = trimmed[(trimmed.length - 1) - i]
            if (!startchar.equals(endchar, true)) {
                return false
            }
        }
        return true
    }
}
