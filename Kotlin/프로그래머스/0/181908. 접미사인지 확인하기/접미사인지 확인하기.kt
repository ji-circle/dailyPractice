class Solution {
    // fun solution(my_string: String, is_suffix: String): Int {
    //     var answer: Int = 0
    //     var stringtemp = my_string.length-1
    //     var suffixtemp = is_suffix.length-1
    //     var start = stringtemp - suffixtemp
    //     if(start < 0){
    //         answer = 0
    //         return answer
    //     }
    //     for (j in 0..suffixtemp){
    //         if(my_string[start] != is_suffix[j]){
    //             answer = 0
    //             break
    //         }
    //         else{
    //         start += 1
    //         answer = 1       
    //     }}
    //     return answer
    // }
    fun solution(myString: String, isSuffix: String) = if (myString.endsWith(isSuffix)) 1 else 0
}