//

import kotlin.math.*

class Solution {
    fun solution(s: String): String {
        
        val sList = s.split(' ').map{it.toInt()}
        var min = sList[0]
        var max = sList[0]
        sList.forEach{
            if(it < min) min = it
            if(it > max) max = it
        }
        var answer = min.toString() + " " + max.toString()
        return answer
    }
}

//class Solution {
//    fun solution(s: String): String {
//        var arr = s.split(" ").map{ it.toInt() }
//        return "${arr.minOf{it}.toString()} ${arr.maxOf{it}.toString()}"
////        return "${arr.minOrNull().toString()} ${arr.maxOrNull().toString()}"
//    }
//}
