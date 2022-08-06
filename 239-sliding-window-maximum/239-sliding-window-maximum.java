class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // push indexes for nge
        st.push(n-1);
        nge[n-1] = n; // or infinity
        for(int i=n-2;i>=0;i--){
            int val = nums[i];
            while(!st.isEmpty() && val >= nums[st.peek()] ){
                st.pop();
            }
            
            if( st.size() == 0 ){
                nge[i] = n;
            }else{
                nge[i] = st.peek();
            }
            
            st.push(i);
        }
        
        int[] res = new int[n-k+1];
        int j = 0;
        for(int i=0;i<res.length;i++){
            if(j < i){
                j = i;
            }
            
            while( nge[j] <= i+k-1 ){
                j = nge[j];
            }
            
            res[i] = nums[j];
        }
        
        return res;
    }
}