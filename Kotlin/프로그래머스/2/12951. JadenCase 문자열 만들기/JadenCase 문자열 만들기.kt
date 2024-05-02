//다시해보기

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


//class Solution {
//     fun solution(s: String): String {
//          return s.toLowerCase().split(" ").map {
//                it.capitalize()
//            }.joinToString(" ")
//    }
//}

//class Solution {
//    fun solution(s: String): String {
//        return s.toLowerCase().split(" ").joinToString(" "){ it.capitalize() }
//    }
//}
