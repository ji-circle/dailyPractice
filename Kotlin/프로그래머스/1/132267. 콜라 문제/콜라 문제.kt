class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var prev: Int = n
        var after: Int = 0
        while(prev>=a){
            answer += (prev/a)*b
            
            after = (prev/a)*b
            after += prev%a
            
            prev = after
        }
        return answer
    }
}