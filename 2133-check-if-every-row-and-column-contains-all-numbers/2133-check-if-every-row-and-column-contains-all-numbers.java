class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int row=0;row<n;row++){
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for(int col = 0;col<n;col++){
                if(!set1.add(matrix[row][col]) || !set2.add(matrix[col][row])){
                    return false;
                }
            }
        }
        return true;
    }
}
