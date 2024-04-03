class Solution {
    fun solution(s: String, n: Int): String=
    
    //다시해보기
    
        s.map {
            when {
                it.isUpperCase() -> 'A' + (it + n - 'A')%26
                it.isLowerCase() -> 'a' + (it + n - 'a')%26
                else -> ' '
            }
        }.joinToString("")
    
}