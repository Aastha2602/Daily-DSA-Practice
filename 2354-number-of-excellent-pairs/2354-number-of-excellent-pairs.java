class Solution {
//     public long countExcellentPairs(int[] nums, int k) {
//         HashSet<String> set = new HashSet<>();
        
//         ArrayList<long[]> p = new ArrayList<>();
//         getAllPairs(nums, 0, nums.length-1, p);
//         for(int i=0;i<p.size();i++ ){
//             long a = p.get(i)[0];
//             long b = p.get(i)[1];
//             long or = a | b;
//             long sum = a & b;
//             if( (long)countSetBits(or) + (long)countSetBits(sum) >= (long) k){
//                 set.add( a + " " + b );
//             }
//         }
        
//         return set.size();
//     }
    
//     public long countSetBits(long n){
//         long count = 0;
//         while (n > 0) {
//             count += n & 1;
//             n >>= 1;
//         }
//         return count;
//     }
    
//     public void getPairsMerge(int arr[],int l,int r,int mid,ArrayList<long[]> p){
//         int[] b = new int[l+r+1] ;
//         int i=l,k=l,j=mid+1;
//         while(i<=mid && j<=r){
//             if(arr[i]>arr[j]){
//                 b[k]=arr[j];
//                 p.add(new long[] {arr[i],arr[j]});
//                 p.add(new long[] {arr[j],arr[i]});
//                 p.add(new long[] {arr[j],arr[j]});
//                 k++;
//                 j++;
//             }
//             else{
//                 p.add(new long[] {arr[i],arr[j]});
//                 p.add(new long[] {arr[j],arr[i]});
//                 p.add(new long[] {arr[i],arr[i]});
//                 b[k]=arr[i];
//                 i++;
//                 k++;
//             }
//         }

//         while(i<=mid){
//             b[k]=arr[i];
//             p.add(new long[] {arr[i],arr[i]});
//             i++;
//             k++;
//         }
//         while(j<=r){
//             b[k]=arr[j];
//             p.add(new long[] {arr[j],arr[j]});
//             j++;
//             k++;
//         }

//         for(int x=l;x<=r;x++){
//             arr[x]=b[x];
//         }
//     }
 
//     public void getAllPairs(int arr[],int l,int r,ArrayList<long[]> p){
//         if(l<r){
//             int mid=(l+r)/2;
//             getAllPairs(arr,l,mid,p);
//             getAllPairs(arr,mid+1,r,p);
//             getPairsMerge(arr,l,r,mid,p);
//         }
//     }
    
    public long countExcellentPairs(int[] nums, int k) {
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int val:nums){
            int x = Integer.bitCount(val);
            map.putIfAbsent(x,new HashSet<>());
            map.get(x).add(val);
        }
        
        long ans = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(int val:nums){
            if(visited.contains(val)) continue;
            int need = Math.max( 0, k-Integer.bitCount(val));
            for(int key:map.keySet()){
                if(key >= need){
                    ans += (long) map.get(key).size();
                }
            visited.add(val);
            }
        }
        return ans;
    }
}