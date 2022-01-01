class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++){
            int j=i+p.length();
            String s1=s.substring(i,j);
            if(validAnagram(s1,p)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean validAnagram(String s1,String p){
        int[] arr=new int[26];
        for(int i=0;i<p.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[p.charAt(i)-'a']--;
        }
        
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}