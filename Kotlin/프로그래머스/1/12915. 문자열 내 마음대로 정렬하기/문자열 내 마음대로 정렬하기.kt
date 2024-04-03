class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        
        
        return strings.sortedBy{it}.sortedBy{it[n]}
        .toTypedArray()
        
    }
}