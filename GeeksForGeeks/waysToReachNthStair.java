class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // Using recurrsion
        // if(n==1 || n==2){
        //     return n;
        // }
        
        // int jump1 = countWays(n-1);
        // int jump2 = countWays(n-2);
        
        // return jump1 + jump2;
        
        //Using for loop
        
       if(n==1 || n==2)return n;
       int a=1,b=2,sum=0;
       for(int i=3;i<=n;i++)
       {
           sum=(a+b)%1000000007;  //https://www.geeksforgeeks.org/modulo-1097-1000000007/
           a=b%1000000007;
           b=sum;
       }
       return sum;
    }
}
