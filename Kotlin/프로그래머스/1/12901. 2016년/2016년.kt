class Solution {
    fun solution(a: Int, b: Int): String {
        
        //다시 해보기.. 왜 sum에서 1 빼야 맞는거지..?
        
        var answer = ""
        val date = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val day = listOf("FRI", "SAT","SUN","MON", "TUE", "WED", "THU")
        var sum = 0
        for(i in 1..a-1){
            sum += date[i-1]
        }
        sum += b
        val temp = (sum-1)%7
        answer = day[temp]
        return answer
    }
}