class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        
        //다시 해보기...
        
        var answer = "Yes"
        var idx1 = 0
        var idx2 = 0
        
        goal.forEach { 
            //it은 람다로 goal 배열의 각 요소...
            if((idx1 < cards1.size) && (cards1[idx1] == it)){
                idx1++
            } else if((idx2 < cards2.size) && (cards2[idx2] == it)){
                idx2++
            } else {
                return "No"
            }
        }
        return answer
    }
}