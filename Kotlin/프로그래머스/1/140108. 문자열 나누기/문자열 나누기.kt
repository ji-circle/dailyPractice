// 다시해보기

//1) 문자 배열이 핵심이 아니라 cnt에 집중해야 할 문제
//2) 최초 string 대입
//3) 문자열이 같을 경우, 처음 문자열과 다를 경우 cnt 확인
//4) 만약 처음 문자열 같은 경우의 cnt와 문자열이 다른 경우 cnt가 일치한다면?
//5) resultCnt++ 기존 cnt와 start는 초기화
//6) start가 공백이 아니라면 resultCnt는 1 증가

class Solution {
    fun solution(s: String): Int {                
        
        var start = ""
        var isSameCnt = 0
        var isNotSameCnt = 0
        var resultCnt = 0
        
        for(i in 0 until s.length) {
            
            // 최초
            if(start == "") start = s[i].toString()
                
            // 처음 문자열과 같을 경우
            if(start == s[i].toString()) isSameCnt++
            
            // 처음 문자열 다를 경우
            else isNotSameCnt++                                     
            
            // 횟수가 같아질 경우 새로운 결과값 도출 기존 cnt는 초기화 진행
            if(isSameCnt == isNotSamCnt) {
                resultCnt++                
                isSameCnt = 0
                isNotSameCnt = 0                                            
                start = ""
            }
        }
        
        if(start != "") resultCnt++
                
        return resultCnt
    }
}

//class Solution{
//    fun solution(s: String): Int{
//        var answer: Int = 0

//        var char = ' '
//        var cnt = 0
//        for(c in s){
//            when(chr){
//                ' ', c -> {
//                    cnt++
//                    chr = c
//                }
//                else -> {
//                    cnt--
//                }
//            }

//            if (cnt == 0) {
//                answer++
//                chr = ' '
//            }
//        }
//        if(cnt > 0){
//            answer++
//        }
//        return answer
//    }
//}
