//다시 해보기

class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

		// 정렬 먼저
        lost.sort()
        reserve.sort()
        // 변환 가능하게 바꾸기
        var lostList = lost.toMutableList()
        var reserveList = reserve.toMutableList()
        
        //겹치는(자기가 입어야 하는)경우 처리... 제거할 것에 add
        var removed = mutableListOf<Int>()
        lostList.forEach {
            if(reserveList.contains(it)) {
                removed.add(it)
            }
        }
        lostList.removeAll(removed)
        reserveList.removeAll(removed)

		// 인덱스 가지고 순환 시작
        for(i in lostList.indices) {
            for(j in reserveList.indices) {
                // -1 이거나 +1 인 경우
                if(reserveList[j] == lostList[i] - 1 || reserveList[j] == lostList[i] + 1) {
                    // 빌려준 사람은 리스트에서 없애기
                    reserveList.removeAt(j) 
                    ++ answer
                    break
                }
            }
        }
        // 전체 인원에서 (잃어버렸던 사람 수 - 빌린 사람) 빼기
        return n - (lostList.size - answer) 
    }
}