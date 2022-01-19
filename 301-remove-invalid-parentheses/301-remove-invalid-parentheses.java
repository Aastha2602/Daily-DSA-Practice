class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans=new ArrayList<>();
        
        if(s==null){
            return ans;
        }
        
        Set<String> visited = new HashSet<>();
        Queue<String> queue=new LinkedList<>();
        
        queue.add(s);
        visited.add(s);
        
        boolean found=false;
        
        while(!queue.isEmpty()){
            s=queue.poll();
            
            if(isValid(s)){
                ans.add(s);
                found=true;
            }
            
            if(found){
                continue;
            }
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='(' && s.charAt(i)!=')' ){
                    continue;
                }
                
                String temp=s.substring(0,i)+s.substring(i+1);
                
                if(!visited.contains(temp)){
                    queue.add(temp);
                    visited.add(temp);
                }
            }
        }
        
        return ans;
    }
    
    public boolean isValid(String str){
        int count=0;
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                count++;
            }
            if(ch==')' && count-- ==0 ){
                return false;
            }
        }
        return count==0;
    }
}