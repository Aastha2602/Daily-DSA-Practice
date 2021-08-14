class Solution {
    public List<Integer> partitionLabels(String S) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(int i = 0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch, -1);
            map.put(ch, i);
        }
        
        
        int left = 0;
        int right = map.get(S.charAt(0));
       // int count = 0;
        List<Integer> ans = new ArrayList<Integer>();
        
        while(left < S.length() && right<S.length())
        {
            for(int i = left;i<=right;i++)
            {
                char ch = S.charAt(i);
                if(map.get(ch)<=right)
                {
                    //Do nothing
                }
                else
                {
                    //Extend the right boundary
                    right = map.get(ch);
                }
             //   count += 1;
            }
          
            // setting the answer
            ans.add(right - left + 1);
            left = right + 1;
            if(right+1 < S.length()) 
                right = right + 1;
        }
        
        return ans;
    }
}

