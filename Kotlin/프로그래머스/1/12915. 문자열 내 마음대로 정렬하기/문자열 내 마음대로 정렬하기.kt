class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        
        //다시해보기
        
        return strings.sortedBy{it}.sortedBy{it[n]}.toTypedArray()
        
    }
}