class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] engineer = new int[n][2];
        int MOD=(int) 1e9+7;
        for(int i=0;i<n;i++){
            engineer[i]=new int[]{efficiency[i],speed[i]};
        }
        Arrays.sort(engineer, (a,b) -> b[0]-a[0] );// to sort in decreasing order of efficiency
        PriorityQueue<Integer> pq=new PriorityQueue<>( k, (a,b) -> a-b );//min priorityqueue of size k
        long result=Long.MIN_VALUE, totalSpeed=0;
        
        for(int[] e:engineer){
            
            if(pq.size() == k ){
                totalSpeed-=pq.poll();
            }
            pq.add(e[1]);
            totalSpeed=( totalSpeed + e[1] );
            result=Math.max(result,(totalSpeed*e[0]));
        }
        return (int) (result % MOD);
    }
}