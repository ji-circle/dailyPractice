class Solution {
    fun solution(numbers: IntArray): List<Int> {
        val answer = mutableListOf<Int>()
        for(i in 0..numbers.size-2){
            for(j in i+1..numbers.size-1){
                val temp = numbers[i]+numbers[j]
                if(!answer.contains(temp)){
                    answer.add(temp)
                }
            }
        }
        answer.sort()
        return answer
    }
}