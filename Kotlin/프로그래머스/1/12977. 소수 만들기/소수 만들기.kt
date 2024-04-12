class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        var temp = 0
        var isPrime = false
        
        for(i in 0..nums.size-3){
            for(j in i+1..nums.size-2){
                for(k in j+1..nums.size-1){
                    temp = nums[i] + nums[j] + nums[k]
                    for(l in 2..temp-1){
                        if(temp%l==0){//소수가 아님
                            isPrime = false
                            break
                        }else{
                            isPrime = true
                        }                        
                    }
                    if(isPrime){
                        answer += 1
                        println(temp)
                    }
                }
            }
        }
        return answer
    }
}