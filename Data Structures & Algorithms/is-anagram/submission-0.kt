class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sortedfirstString = s.toList().sorted().joinToString("")
        val sortedsecondString = t.toList().sorted().joinToString("")
        if (sortedfirstString.equals(sortedsecondString, true)) {
            return true
        }
        return false
    }
}
