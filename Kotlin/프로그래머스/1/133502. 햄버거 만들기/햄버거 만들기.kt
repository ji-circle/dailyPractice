// 다시 해보기!!

import java.util.*

class Solution {
    fun solution(ingredient: IntArray): Int {
        //1: 빵, 2: 야채, 3: 고기, 4: 빵
        val st = Stack<Int>()
    
        var answer: Int = 0
        for(ing in ingredient){
            st.push(ing)
            
            //빵 야채 고기 빵 확인
            if(st.size >= 4){
                val peek1 = st.peek()
                st.pop()
                val peek2 = st.peek()
                st.pop()
                val peek3 = st.peek()
                st.pop()
                val peek4 = st.peek()
                st.pop()
                
                if((peek4 == 1) && (peek3 == 2) && (peek2 == 3) && (peek1 == 1)) answer++;
                else{
                    //원상복구
                    st.push(peek4)
                    st.push(peek3)
                    st.push(peek2)
                    st.push(peek1)
                }
            }
        }
        return answer
    }
}

//class Solution {
//    fun solution(ingredient: IntArray): Int {
//        var answer: Int = 0
//        val sb = StringBuilder()
//        for(item in ingredient) {
//            sb.append('0'+item)
//            if(sb.length >= 4 && sb.substring(sb.length-4) == "1231") {
//                sb.setLength(sb.length-4)
//                answer++
//            }
//        }
//        return answer
//    }
//}

//private fun solution3(ingredient: IntArray): Int {
//    var answer: Int = 0
//    val a = Stack<Int>()
//    for (i in ingredient) {
//        a.add(i)

//        if (a.peek() == 1 && a.size >= 4) {
//            val first = a[a.size - 4] == 1
//            val second = a[a.size - 3] == 2
//            val third = a[a.size - 2] == 3
//            val fourth = a[a.size - 1] == 1

//            if (first && second && third && fourth) {
//                repeat(4) { a.pop() }
//                answer++
//            }

//        }
//    }
//    return answer
//}
