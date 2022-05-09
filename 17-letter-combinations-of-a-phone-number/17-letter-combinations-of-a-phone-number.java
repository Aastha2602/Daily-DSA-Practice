class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        if(digits == null || digits.length() == 0){
            return list;
        }
        char[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        backtrack(digits,list,map,new StringBuilder(),0);
        return list;
    }
    public void backtrack(String digits,List<String> list,char[][] map,StringBuilder sb,int start){
        if(start == digits.length()){
            list.add(new String(sb));
            return;
        }
        
        int num = digits.charAt(start) - '0';
        for(int i=0;i<map[num].length;i++){
            sb.append(map[num][i]);
            backtrack(digits,list,map,sb,start+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}