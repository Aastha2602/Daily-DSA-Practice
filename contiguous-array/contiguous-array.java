class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        
        int ans=0,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i] ==0 ?-1:1;
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));
            }
            map.putIfAbsent(sum,i);
        }
        return ans;
    }
}