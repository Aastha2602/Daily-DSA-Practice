class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans=new LinkedList<>();
        if(digits.length()==0){
            return ans;
        }
        
        String[] mappings=new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        while(ans.peek().length()!=digits.length()){
            String removed=ans.remove();
            String map=mappings[digits.charAt(removed.length())-'0'];
            for(char ch:map.toCharArray()){
                ans.addLast(removed+ch);
            }
        }
        return ans;
    }
}