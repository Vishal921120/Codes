public class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            if(nums[mid] == target){
                return mid; //search successful
            }else if (nums[mid]<target){
                left = mid+1;
            }else {
                //nums[mid]> target
                right = mid-1;
            }
        }
        
        return -1; //unsuccessful element
        
    }
}
