class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left,n);
        Arrays.fill(right,n);
        
        for(int i=0;i<n;i++){
            if(seats[i] == 1 ){
                left[i] = 0;
            }else if(i > 0){
                left[i] = left[i-1] + 1;
            }
        }
        
        for(int i=n-1;i>=0;i--){
            if(seats[i] == 1 ){
                right[i] = 0;
            }else if(i< n-1){
                right[i] = right[i+1] + 1;
            }
        }
        
        int count = 0;
        
        for(int i=0;i<n;i++){
            if(seats[i] == 0 ){
                count = Math.max(count, Math.min(left[i],right[i]));
            }
        }
        return count;
    }
}



// 0 1 2 3 0 1 0
// 0 3 2 1 0 1 0
    
// -1 1 2 1 -1 1 -1 
    
// -1 1 2 1 -1 1 -1
    
    
    
// 0 1 2 3
// 0 2 1 3
    
// -1 1 2 3
// 1 -1    
