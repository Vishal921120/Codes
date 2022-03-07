//leetcode problem 167
public class twoSumL167 {
    public int[] twoSum(int[] numbers, int target) {
        int left =0 ; 
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};
                // int[]arr = new int[2] ;
                //  arr[0]= left+1;
                //  arr[1]= right+1;
                //  return arr;
            }
            if(sum<target)left++;
            else right--;
        }
        
        return null;
    }
}
