class Solution {
    fun solution(food: IntArray): String {
        
        //다시해보기
        
        var answer: String = ""
        food.forEachIndexed{i,j->
            if(i!=0)
                repeat(j/2){
                    answer += i.toString()
                }
        }
        return answer + '0' + answer.reversed()
    }
}