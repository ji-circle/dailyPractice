class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var bigger = 0
        var temp = 0
        var temp2 = 0
        if(n >= m){
            bigger = n
        }else{
            bigger = m
        }
        for(i in 1..bigger){
            if(n%i==0){
                if(m%i==0){
                    temp = i
                }
            }
        }
        for(j in bigger..m*n){
            if(j%n==0){
                if(j%m==0){
                    temp2=j
                    break
                }
            }
        }
        val answer = intArrayOf(temp, temp2)
        return answer
    }
}