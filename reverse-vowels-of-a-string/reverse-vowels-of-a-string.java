class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        char[] ch=s.toCharArray(); 
        int start=0,end=s.length()-1;
            while(start<end){
                if(!set.contains(ch[start])){
                    start++;
                }else if(!set.contains(ch[end])){
                    end--;
                }else{
                    char temp=ch[start];
                    ch[start]=ch[end];
                    ch[end]=temp;
                    start++;
                    end--;
                }        
            }
        return String.valueOf(ch);
    }
}