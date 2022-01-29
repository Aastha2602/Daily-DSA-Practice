class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b) -> b.getValue()-a.getValue() );
        pq.addAll(map.entrySet());
        
        int[] ans=new int[k];
        int index=0;
        
        ArrayList<Integer> list=new ArrayList<>();
        while(list.size()<k){
            Map.Entry e=pq.poll();
            ans[index]=(int)e.getKey();
            list.add((int)e.getKey());
            index++;
        }
        
//         for(int i=0;i<list.size();i++){
//             System.out.println(list.get(i));
//         }
        
        return ans;
        
    }
}