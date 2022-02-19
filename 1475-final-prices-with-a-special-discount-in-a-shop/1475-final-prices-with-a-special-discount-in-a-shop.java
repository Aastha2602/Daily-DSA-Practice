class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<prices.length;i++){
                while(!st.isEmpty() && prices[st.peek()]>=prices[i] ){
                    //st.pop();
                    prices[st.pop()] -= prices[i];
                }
                //nge[i] = st.isEmpty() ? 0 : st.peek();   
                st.push(i);
        }
        return prices;
    }
}