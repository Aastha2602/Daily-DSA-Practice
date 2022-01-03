class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        //t[] arr=new int[nums2.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else if(nums2[i]<st.peek()){
                map.put(nums2[i],st.peek());
            }else{
                while( !st.isEmpty() && nums2[i]>=st.peek()  ){
                    st.pop();
                }
                if(st.isEmpty()){
                    map.put(nums2[i],-1);
                }else{
                    map.put(nums2[i],st.peek());
                }
            }    
            st.push(nums2[i]);
        }
        
        
        int[] ans=new int[nums1.length];
        //t i=0;
        for(int i=0;i<ans.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i]=map.get(nums1[i]);
            }
            //+;
        }
        
        
        return ans;
    }
}