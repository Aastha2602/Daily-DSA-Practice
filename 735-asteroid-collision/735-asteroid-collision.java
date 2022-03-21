class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()< -asteroids[i]){
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0 ){
                    st.push(asteroids[i]);
                }else if(st.peek() == -asteroids[i] ){
                    st.pop();
                }
            }
        }
        
        
        return st.stream().mapToInt(i->i).toArray();
        
    }
}