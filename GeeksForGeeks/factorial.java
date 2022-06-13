class Solution{
    static long factorial(int N){
        // code here
        if(N==1 || N==0){
            return 1;
        }
        
        long res = factorial(N-1);
        long finalRes = N * res;
        
        return finalRes;
        
    }
}