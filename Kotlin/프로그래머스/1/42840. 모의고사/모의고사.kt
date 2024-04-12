class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var temp2 = arrayListOf<Int>()
        var score1 = 0
        var score2 = 0
        var score3 = 0
        
        val first = listOf(1,2,3,4,5)  //5
        val second = listOf(2,1,2,3,2,4,2,5)  //8
        val third = listOf(3,3,1,1,2,2,4,4,5,5)  //10
        
        for(i in 0..answers.size-1){
            if(answers[i]==first[i%5]){
                score1+=1
            }
            if(answers[i]==second[i%8]){
                score2+=1
            }
            if(answers[i]==third[i%10]){
                score3+=1
            }
        }
        val temp = arrayOf(score1, score2, score3)        
        val max = temp.maxOrNull()
        //max() 로 했을 때 오류남
        
        for(i in 0..2){
            if(max == temp[i]){
                temp2.add(i+1)
            }
        }
      
    answer = temp2.toIntArray()
    return answer
    }
}