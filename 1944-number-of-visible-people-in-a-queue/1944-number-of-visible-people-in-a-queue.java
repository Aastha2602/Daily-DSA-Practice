class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] nge = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()] <= heights[i] ){
                nge[st.pop()]++;
            }
            if(!st.isEmpty()){
                nge[st.peek()]++;
            }
            st.push(i);
        }
        return nge;
    }
}