class Solution {
    class Pair implements Comparable<Pair>{
        int i;
        int j;
        int tesf;
        Pair(int i, int j, int tesf){
            this.i = i;
            this.j = j;
            this.tesf = tesf;
        }
        
        public int compareTo(Pair o){
            return this.tesf - o.tesf; // smaller one will be at the top
        }
    }
    public int swimInWater(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        pq.add(new Pair(0, 0, grid[0][0]));
        while(pq.size() > 0 ){
            Pair rem = pq.remove();
            
            if(visited[rem.i][rem.j] == true){
                continue;
            }
            visited[rem.i][rem.j] = true;
            
            if(rem.i == m-1 && rem.j == n-1){ // when reached on the destination
                return rem.tesf;
            }
            
            addN( rem.i+1, rem.j, rem.tesf, grid, visited, pq );
            addN( rem.i-1, rem.j, rem.tesf, grid, visited, pq );
            addN( rem.i, rem.j+1, rem.tesf, grid, visited, pq );
            addN( rem.i, rem.j-1, rem.tesf, grid, visited, pq );
        }
        return -1;
    }
    
    public void addN(int i, int j, int ot, int[][] grid, boolean[][] visited, PriorityQueue<Pair> pq){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j] == true ){
            return;
        }
        
        pq.add(new Pair(i, j, Math.max(ot, grid[i][j]) ));
    }
    
}