class Solution {
    fun solution(s: String): String {
        
        //다시 해보기
        
        var splitS = s.split(' ')
        var answer = arrayOf<String>()
        
        splitS.forEach{s ->
            var string = ""
            s.forEachIndexed { index, c ->
                string += when(index%2){
                    0 -> c.toUpperCase()
                    else -> c.toLowerCase()
                }
            }
            answer += string
        }
        return answer.joinToString(' '.toString())
    }
}