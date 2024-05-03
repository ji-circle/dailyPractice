//다시 해보

class Solution {
    fun solution(s: String): IntArray {
        val answer = IntArray(2)
        var str:String = s
        // str이 1이 될때까지
        while(str != "1"){
            // 1회마다 증가
            answer[0]++
            // 제거된 0의 개수 누적합
            answer[1] += str.replace("1", "").length
            // str 길이를 2진 변환한 값으로 초기화
            str = str.replace("0", "").length.toString(2)
        }
        return answer
    }
}

//class Solution {
//    fun solution(s: String): IntArray {
//        var copiedS = s
//        var removedZero = 0
//        var count = 0

//        while (copiedS != "1") {
//            removedZero += copiedS.replace("1", "").count()
//            copiedS = Integer.toBinaryString(copiedS.replace("0", "").count())
//            count++
//        }
//        return intArrayOf(count, removedZero)
//    }
//}
