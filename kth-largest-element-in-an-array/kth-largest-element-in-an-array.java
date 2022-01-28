class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        // for(int i=1;i<k;i++){
        //     pq.remove();
        // }
        return pq.peek();
    }
}