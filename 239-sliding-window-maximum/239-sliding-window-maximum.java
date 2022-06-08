class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] result = new int[nums.length - k + 1 ];
        int ri = 0;
        Deque<Integer> qu = new ArrayDeque<>();
        
        for(int i=0;i<nums.length;i++){
            // remove all out of range
            if(!qu.isEmpty() && qu.peek() == i-k ){
                qu.poll();
            }
            
            while(!qu.isEmpty() && nums[qu.peekLast()]<= nums[i] ){
                qu.pollLast();
            }
            
            qu.offer(i);
            
            if(i >= k-1){
                result[ri++] = nums[qu.peek()];
            }
        }
        return result;
    }
}