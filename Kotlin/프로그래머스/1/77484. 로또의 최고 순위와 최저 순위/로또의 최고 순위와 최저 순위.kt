class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): List<Int> {
        var match = 0
        var blank = 0
        for(lotto in lottos){
            if(lotto == 0){
                blank++
                continue
            }
            for(num in win_nums){
                if(num == lotto){
                    match ++
                    break
                }else{
                    continue                    
                }
            }
            //
        }
        var best = (7-blank-match)
        var worst = (7-match)
        if(worst == 7){
            worst = 6
        }
        if(best == 7){
            best = 6
        }
        var answer = listOf(best,worst)
        return answer
    }
}