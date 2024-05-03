//

class Solution {
    fun solution(s: String): IntArray {
        val answer = IntArray(2)
        var str:String = s
        while(str != "1"){
            answer[0]++
            answer[1] += str.replace("1", "").length
            str = str.replace("0", "").length.toString(2)
        }
        return answer
    }
}