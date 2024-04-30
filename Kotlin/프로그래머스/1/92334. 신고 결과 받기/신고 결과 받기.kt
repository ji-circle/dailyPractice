// 다시

class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var map = mutableMapOf<String, Int>()
        report.distinct().forEach {
            val key = it.split(' ')[1]
            map[key] = map.getOrDefault(key, 0) + 1
        }
        var list = map.filterValues { it >= k }
        var answerMap = mutableMapOf<String, Int>()
        id_list.forEach {
            answerMap[it] = 0
        }
        report.distinct().forEach {
            val key = it.split(' ')[0]
            if (list.contains(it.split(' ')[1])) {
                answerMap[key] = answerMap.getOrDefault(key, 0) + 1
            }
        }
        return answerMap.values.toIntArray()
    }
}