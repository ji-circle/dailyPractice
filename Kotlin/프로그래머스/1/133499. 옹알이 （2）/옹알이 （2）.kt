class Solution {
    
    // 다시해보기

    //fun solution(babbling: Array<String>) =
        // count => 입력된 babbling 배열에서 조건을 만족하는 요소의 개수를 반환
    //    babbling.count {
            // matches => 각 요소가 정규식 패턴과 일치하는지 확인
            //  "^ => 문자열의 시작, 그 다음 괄호 안은 여러 개의 문자열을 나타냄
            // aya(?!aya) => "aya"로 시작하지만 "aya"로 뒤따라 나오지 않는 문자열
            // + => 앞의 패턴이 하나 이상 반복되어야 함
            // $ => 문자열의 끝
    //        it.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$".toRegex())
    //    }

    
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
