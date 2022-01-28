class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length<2){
            return stones[0];
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        
        while(pq.size()>1){
            int num1=pq.poll();
            int num2=pq.poll();
            if(num1==num2){
                pq.add(0);
            }else{
                pq.add(Math.abs(num1-num2));
            }
        }
        return pq.peek();
    }
}