class Solution {
    static long nthFibonacci(long n){
        // code here
        
       int a = 0, b = 1;
       if(n == 1)
           return 0;

       if(n == 2)
           return 1;

       for(int i=2;i<=n;i++){
           int c = (a+b)%1000000007; //https://www.geeksforgeeks.org/modulo-1097-1000000007/
           a = b;
           b = c;
       }

       return b;
   
    }
}
