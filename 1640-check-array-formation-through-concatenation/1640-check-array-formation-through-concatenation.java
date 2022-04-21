class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        StringBuilder sb = new StringBuilder();
        for(int val:arr ){
            sb.append('#');
            sb.append(val);
            sb.append('#');
        }
        
        
        for(int i =0;i<pieces.length;i++){
            StringBuilder child = new StringBuilder();
            for(int j =0;j<pieces[i].length;j++){
                child.append('#');
                child.append(pieces[i][j]);
                child.append('#');
            }
            if(!sb.toString().contains(child.toString())){
                return false;
            }
        }
        return true;
    }
}

// #15##88#
// #88# 
// #15#

// #49##18##16#
// #16##18##49#

// #91##4##64##78#
// #78#
// #4##64#
// #91#
