class Solution {
    public void function(int[][] arr,int[] visited,int i){
        for(int j=0;j<arr.length;j++){
            if(arr[i][j]==1 && visited[j]==0){
                visited[j]=1;
                function(arr,visited,j);
            }
        }    
    }
    
    public int findCircleNum(int[][] arr) {
        int[] visited=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(visited[i]==0){
                function(arr,visited,i);
                count++;
            }
        }
        return count;
    }
}