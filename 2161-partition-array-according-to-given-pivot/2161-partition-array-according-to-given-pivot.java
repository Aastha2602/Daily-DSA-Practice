class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> s = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        
        for(int val:nums){
            if( val<pivot ){
                s.add(val);
            }else if( val == pivot ){
                e.add(val);
            }else{
                l.add(val);
            }
        }
        
        List<Integer> merged = new ArrayList<>();
        merged.addAll(s);
        merged.addAll(e);
        merged.addAll(l);
        
        int[] arr = new int[merged.size()];
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = merged.get(i);
        }
        
        return arr;
    }
}


// s: 9 5 3
// e: 10 10
// l: 12 14
