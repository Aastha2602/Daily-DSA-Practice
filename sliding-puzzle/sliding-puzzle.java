class Solution {
    public int slidingPuzzle(int[][] board) {
        LinkedList<String> qu=new LinkedList<>();
        String tar="123450";
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                sb.append(board[i][j]);
            }
        }
        
        String initial=sb.toString();
        int[][] swapidx={{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{4,2}};
        
        qu.addLast(initial);
        int level=0;
        HashSet<String> set=new HashSet<>(); // same as visited array
        while(qu.size()>0){
            int size=qu.size();
            while(size-- >0){
                String rem=qu.removeFirst();
                if(rem.equals(tar)){
                    return level;
                }
                
                int idx=-1;
                for(int i=0;i<rem.length();i++){
                    if(rem.charAt(i)=='0'){
                        idx=i;
                        break;
                    }
                }
                
                int[] swap=swapidx[idx];
                for(int i=0;i<swap.length;i++){
                    String tobeadded=swapchar(rem,idx,swap[i]);
                    if(set.contains(tobeadded)){
                        continue;
                    }
                    qu.addLast(tobeadded);
                    set.add(tobeadded);
                }
            }
            level++;
        }
        return -1;
    }
    
    public static String swapchar(String st,int i,int j){
        StringBuilder sb=new StringBuilder(st);
        sb.setCharAt(i,st.charAt(j));
        sb.setCharAt(j,st.charAt(i));
        return sb.toString();
    }
}