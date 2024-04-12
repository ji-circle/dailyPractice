class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var tempScore = score
        var tempM = score.size-1
        var i = m-1
        
        tempScore.sortDescending()
        while(i <= tempM){
            answer += tempScore[i]*m
            i+=m
        }
        
        
        
        return answer
    }
}