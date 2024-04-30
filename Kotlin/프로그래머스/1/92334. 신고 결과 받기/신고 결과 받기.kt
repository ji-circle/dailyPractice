// 다시

class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {

        // 신고 카운트를 누적함
        var map = mutableMapOf<String, Int>()
        report.distinct().forEach {
            val key = it.split(' ')[1]
            map[key] = map.getOrDefault(key, 0) + 1
        }

        // 정지된 놈들만 찾아냄
        var list = map.filterValues { it >= k }

        // 초기화
        var answerMap = mutableMapOf<String, Int>()
        id_list.forEach {
            answerMap[it] = 0
        }

        // 정지된 놈을 신고한 놈들을 찾아냄
        report.distinct().forEach {
            val key = it.split(' ')[0]
            if (list.contains(it.split(' ')[1])) {
                answerMap[key] = answerMap.getOrDefault(key, 0) + 1
            }
        }

        return answerMap.values.toIntArray()
    }

}


//class Solution {
//    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray =
//    report.map { it.split(" ") }
//        .groupBy { it[1] }
//        .asSequence()
//        .map { it.value.distinct() }
//        .filter { it.size >= k }
//        .flatten()
//        .map { it[0] }
//        .groupingBy { it }
//        .eachCount()
//        .run { id_list.map { getOrDefault(it, 0) }.toIntArray() }
//}
