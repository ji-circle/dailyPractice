class Solution {
    
    //다시해보기
    
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        //rank: 상위 K 점수 오름차순으로 저장
        var rank = mutableListOf<Int>()
        for(sc in score){
            if(rank.size < k)
                rank += sc
            else if(rank[0] < sc)
                rank[0] = sc
            
            rank.sort()
            answer += rank[0]
        }
        return answer
    }
}