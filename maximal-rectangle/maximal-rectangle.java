class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }
        int[] height = new int[matrix[0].length];
        int maxArea=-1;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    height[j]=0;
                }else{
                    height[j]++;
                }
            }
            
            int area=largestRectangleArea(height);
            maxArea= Math.max(maxArea,area);
        }
        return maxArea;
    }
    public int largestRectangleArea(int[] heights) {
        if(heights ==null || heights.length==0 ){
            return 0;
        }

        int[] left=new int[heights.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        left[0]=-1;
        
        for(int i=1;i<heights.length;i++){
            while(st.size()>0 && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            
            if(st.size()==0){
                left[i]=-1;
            }else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        
        
        int[] right=new int[heights.length];
        Stack<Integer> st1=new Stack<>();
        st1.push(heights.length-1);
        right[heights.length-1]=heights.length;
        
        for(int i=heights.length-2;i>=0;i--){
            while(st1.size()>0 && heights[i]<=heights[st1.peek()]){
                st1.pop();
            }
            
            if(st1.size()==0){
                right[i]=heights.length;
            }else{
                right[i]=st1.peek();
            }
            st1.push(i);
        }
        
        
        int max=0;
        for(int i=0;i<heights.length;i++){
            int width = right[i]-left[i]-1;
            int area = heights[i] * width;
            if(area>max){
                max=area;
            }
        }
        return max;
    }
}