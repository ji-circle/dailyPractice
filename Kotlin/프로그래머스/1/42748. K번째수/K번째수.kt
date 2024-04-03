class Solution {
    
    //다시해보기
    
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        
           commands.forEach {
               answer += array.sliceArray((it[0] - 1) until it[1]).apply { sort() }[it[2] - 1]
           }
        
        return answer
    }
}


//class Solution {
//    fun solution(array: IntArray, commands: Array<IntArray>): IntArray =
//        commands.map { array.sliceArray((it[0] - 1) until it[1]).apply {sort()}[it[2] - 1] }.toIntArray()
//}