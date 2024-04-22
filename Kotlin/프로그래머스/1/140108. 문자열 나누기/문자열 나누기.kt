class Solution {
    fun solution(s: String): Int {                
        
        var start = ""
        var case1 = 0
        var case2 = 0
        var resultCnt = 0
        
        for(i in 0 until s.length) {
            if(start == "") start = s[i].toString()
            if(start == s[i].toString()) case1++
            else case2++                                     
            
            if(case1 == case2) {
                start = ""
                resultCnt++                
                case1 = 0
                case2 = 0                                            
            }
        }
        
        if(start != ""){
            resultCnt++
        }
                
        return resultCnt
    }
}