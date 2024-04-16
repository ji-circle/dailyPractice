class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var best = 0
        var worst = 0
        lottos.forEach{
            if(it == 0){
                best++
            }
            if(win_nums.contains(it)){
                best++
                worst++
            }
        }
        
        fun calculate(n: Int) : Int = if(n>=2) 7-n else 6
        return intArrayOf(calculate(best),calculate(worst))
    }
}