//다시하기!!

import kotlin.math.*

class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        
        //minPress[X.code - 'A'.code]: X를 입력하기 위해 키를 눌러야하는 횟수의 최솟값
        var minPress = Array(26, {it -> 200})
        for(kmap in keymap){
            for(i in 0 until kmap.length){
                val k = kmap[i]
                minPress[k.code - 'A'.code] = min(minPress[k.code - 'A'.code], i+1)
            }
        }
        
        var answer: IntArray = intArrayOf()
        for(t in targets){
            //문자열 t를 입력하기 위해 키를 눌러야하는 횟수의 최솟값
            var pressSum = 0
            for(i in 0 until t.length){
                val k = t[i]
                //k를 입력할 수 없는 경우
                if(minPress[k.code - 'A'.code] == 200){
                    pressSum = -1
                    break
                }
                pressSum +=  minPress[k.code - 'A'.code]
            }
            answer += pressSum
        }
        return answer
    }
}

//class Solution {
//    fun solution(keymap: Array<String>, targets: Array<String>): IntArray =
//        targets.map { str ->
//            str.map { c -> keymap.map { it.indexOf(c) + 1 }
//                .filterNot { it < 1 }
//                .let { list ->
//                    if (list.isEmpty()) -1
//                    else list.minOf { it }
//                }
//            }.let { if ( it.contains(-1)) -1 else it.sum() }
//        }.toIntArray()
//}
