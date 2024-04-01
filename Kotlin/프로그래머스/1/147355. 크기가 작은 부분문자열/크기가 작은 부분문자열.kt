class Solution {
    
    //다시 해보기
    
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        for(i in 0..t.length - p.length){
            val temp = t.substring(i, i+p.length)
            if(temp.toLong() <= p.toLong()){
                answer++
            }
        }
        return answer
    }
}