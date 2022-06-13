class Solution {
    // int helper(String s , int Start, int End){
    //     if(Start>=End) return 1;
    //     if(s.charAt(Start) != s.charAt(End)){
    //         return 0;
    //     }
        
    //     return helper(s,Start+1,End-1);
    // }
    int isPalindrome(String S) {
        // code here
        // Using recursion
        // int n = S.length()-1;
        // return helper(S,0,n);
        
        // Using normal while
        int start = 0;
        int end = S.length()-1;
        
        while(start<=end){
            if(S.charAt(end) == S.charAt(start)){
                start++;
                end--;
            }
            else{
                return 0;
            }
        }
        
        return 1;
    }
};
