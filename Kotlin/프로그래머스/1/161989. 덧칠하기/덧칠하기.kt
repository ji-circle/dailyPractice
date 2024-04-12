class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var start = 0
        
        for(i in section){
            if(i > start){
                start = i
                start += m - 1
                answer ++
            }
        }
        return answer
    }
}