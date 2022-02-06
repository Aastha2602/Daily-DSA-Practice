class Solution {
    public int maximumScore(int a, int b, int c) {
        int count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((g,h) -> h-g );
        pq.add(a);
        pq.add(b);
        pq.add(c);
        
        // int m1=0,m2=0;
        while(pq.size()>1){
            int m1=pq.poll();
            int m2=pq.poll();
            if(--m1 >0){
                pq.add(m1--);
            }
            
            if(--m2 >0){
                pq.add(m2--);
            }
            // pq.add(m1--);
            // pq.add(m2--);
            count++;
        }
        
        return count;
    }
}