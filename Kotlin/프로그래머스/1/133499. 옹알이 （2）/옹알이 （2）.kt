class Solution {
    
    // 다시해보기
    
    fun solution(babbling: Array<String>): Int {
    var answer: Int = 0

    for (i in babbling.indices) {
        if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") ||
            babbling[i].contains("woowoo") || babbling[i].contains("mama")
        ) {
            continue
        }
        babbling[i] = babbling[i].replace("aya", " ")
        babbling[i] = babbling[i].replace("ye", " ")
        babbling[i] = babbling[i].replace("woo", " ")
        babbling[i] = babbling[i].replace("ma", " ")
        
        babbling[i] = babbling[i].replace(" ", "")

        //다 제거했으면 가능한 단어 +1
        if (babbling[i].isEmpty()) answer++
    }
    return answer
    }
    
    //fun solution(babbling: Array<String>): Int {
    //    val ableRegex = "aya|ye|woo|ma".toRegex()
    //    val unableRegex = "ayaaya|yeye|woowoo|mama".toRegex()
    //    return babbling.count() {
    //        !it.contains(unableRegex) && it.replace(ableRegex, "").isEmpty()
    //    }
    //}
}