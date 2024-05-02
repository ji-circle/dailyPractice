//

class Solution {
    fun solution(s: String): String {
        var answer = ""
        var temp = s.split(" ")
        answer = temp.joinToString(separator = " "){ each ->
            each.lowercase().replaceFirstChar{it.uppercase()}
            
        }
        return answer
    }
}