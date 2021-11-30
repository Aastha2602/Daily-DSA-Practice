class Solution {
    public String longestNiceSubstring(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp=s.substring(i,j);
                if(temp.length()>1 && temp.length()>result.length() && isValid(temp) == true ){
                    result=temp;
                }
            }
        }
        return result;    
    }
    
    public static boolean isValid(String temp){
        Set<Character> hashset=new HashSet<>();
        
        for(char ch:temp.toCharArray()){
            hashset.add(ch);
        }
        
        for(char ch:hashset){
            if(hashset.contains(Character.toUpperCase(ch)) != hashset.contains(Character.toLowerCase(ch))){
                return false;
            }
        }
        return true;
    }
}