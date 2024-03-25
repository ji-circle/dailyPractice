class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var temp: Long = 0
        for(i in 1..count){
            temp = temp + price*i
        }
        answer = (money - temp)*-1
        if(answer <=0){
            answer = 0
        }
        
        return answer
    }
}