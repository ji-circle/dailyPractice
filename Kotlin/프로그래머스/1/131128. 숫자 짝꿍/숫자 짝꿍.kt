//다시 해보기

import kotlin.math.min

class Solution {
    fun solution(X: String, Y: String): String {
        // 결과를 저장할 변수 선언
        var answer: String = ""

        // 9부터 0까지의 숫자를 역순으로 반복
        //  이를 문자열로 변환해 각 숫자를 ch에 할당
        for (ch in (9 downTo 0).toList().map { it.toString() }) {
            // X와 Y에서 각 숫자 ch의 등장 횟수 중 작은 값을 구하고, 
            //  해당 숫자 ch를 그 횟수만큼 반복하여 answer에 추가
            answer += ch.repeat(
                min(
                    X.count { it.toString() == ch }, // X 문자열에서 숫자 ch의 등장 횟수
                    Y.count { it.toString() == ch }  // Y 문자열에서 숫자 ch의 등장 횟수
                )
            )
        }

        // answer가 비어있다면, 즉, X와 Y에 공통된 숫자가 하나도 없는 경우 "-1"을 할당
        if (answer.isEmpty()) answer = "-1"

        //'answer'를 리스트로 변환하고 중복 제거 후, 리스트가['0']과 같다면, 즉 모든 숫자가 0으로 이루어져 있다면 'answer'를 0으로 설정
        // answer가 모든 숫자가 0으로 이루어져 있다면 "0"으로 설정
        if (answer.toList().distinct() == listOf('0')) answer = "0"

        // 결과 반환
        return answer

    }
}
