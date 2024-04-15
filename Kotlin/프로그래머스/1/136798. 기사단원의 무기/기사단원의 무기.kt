import kotlin.math.sqrt

class Solution(){
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        var sum = 0
        
        //var overpower = mutableListOf<Int>()

        for(i in 1..number){
            var temp = countNum(i)
            if (temp > limit){
                temp = power
            }
            answer += temp
        }
        return answer
    }

    private fun countNum(number: Int): Int {
        var count = 0
        val temp = sqrt(number.toDouble()).toInt()
        //제곱근까지만 해도 되니까.

        for (l in 1..temp) {
            if (number % l == 0) {
                if (l * l == number) {
                    //제곱수인 경우
                    count++
                } else {
                    count += 2
                }
            }
        }
        return count
    }
}