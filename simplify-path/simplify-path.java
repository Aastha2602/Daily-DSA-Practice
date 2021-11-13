class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack=new LinkedList<>();
        Set<String> skip=new HashSet<>(Arrays.asList("..",".",""));
        for(String dir:path.split("/")){
            if(dir.equals("..") && !stack.isEmpty()){
                stack.pop();
            }else if(!skip.contains(dir)){
                stack.push(dir);
            }
        }
        String ans="";
        for(String dir:stack){
            ans="/"+dir+ans;
        } 
        return ans.isEmpty() ? "/":ans;
    }
}