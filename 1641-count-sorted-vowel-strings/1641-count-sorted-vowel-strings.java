class Solution {
    public int countVowelStrings(int n) {
        int[] permutations = {1,1,1,1,1};
        
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=permutations.length-1;j>=0;j--){
                permutations[j] = permutations[j] + sum;
                sum = permutations[j];
            }
        }
        return permutations[0];
    }
}