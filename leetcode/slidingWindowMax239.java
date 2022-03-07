class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[] = new int[nums.length - k +1];
        int idx = 0;
        
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0 ; i<nums.length; i++){
            //removeFirst -> when front element is excluded from current window
            if(q.size() > 0 && q.getFirst()<=i-k){
                q.removeFirst();
            }
            //removeLast -> smaller than our current element
            while(q.size()>0 && nums[q.getLast()]<=nums[i]){
                q.removeLast();
            }
            //add last -> we may be answer of current or upcoming windows
            q.addLast(i);
            
            if(i>=k-1){
                //curr window max is at front of deque
                res[idx++] = nums[q.getFirst()];
            }
        }
        return res;
    }
}