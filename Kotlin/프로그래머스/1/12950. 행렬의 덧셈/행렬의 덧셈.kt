//다시 공부하기

class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray>{
        var answer = Array(arr1.count()) {IntArray(arr1[0].count(), {0})}
        //var answer = arrayOf<IntArray>()
        for(i in 0..arr1.size-1){
            for(j in 0..arr1[0].size-1){
                answer[i][j] = arr1[i][j] + arr2[i][j]                
            }
        }
        return answer
    }
}