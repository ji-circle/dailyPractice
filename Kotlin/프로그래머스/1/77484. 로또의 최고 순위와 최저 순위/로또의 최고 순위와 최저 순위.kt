class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val win = win_nums.toHashSet()
        // hashset 사용하면 중복원소 허용 없이 더 빠르게 검색 가능
        var best = 0
        var worst = 0
        lottos.forEach{
            if(it == 0){
                best++
            }
            //if(win_nums.contains(it)) 해도 되긴 함
            if(win.contains(it)){
                worst++
                best++
            }
        }
        
        fun calculate(n: Int) : Int = if(n>=2) 7-n else 6
        return intArrayOf(calculate(best),calculate(worst))
    }
}
