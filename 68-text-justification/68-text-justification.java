class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        
        int i = 0, n = words.length;
        while(i<n){
            int j = i + 1;
            int lineLength = words[i].length();
            while(j<n && (lineLength + words[j].length() + (j-i-1)) < maxWidth){
                lineLength += words[j].length();
                ++j;
            }
            
            int diff = maxWidth - lineLength;
            int numberOfWords = j-i;
            if( numberOfWords == 1 || j >= n){
                res.add(leftJustify(diff, words, i, j));
            }else{
                res.add(middleJustify(diff, words, i, j));
            }
            
            i = j;
        }
        
        return res;
    }
    
    public String middleJustify(int diff, String[] words, int i, int j){
        int spacesNeeded = j-i-1;
        int spaces = diff/spacesNeeded;  // min spaces
        int extraSpaces = diff%spacesNeeded; // extra in right side
        
        StringBuilder sb = new StringBuilder(words[i]);
        for(int k=i+1;k<j;k++){
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
            sb.append(" ".repeat(spacesToApply) + words[k]);
        }
        
        return sb.toString();
    }
    
    public String leftJustify(int diff, String[] words, int i, int j){
        int spacesOnRight = diff - (j - i - 1);
        StringBuilder sb = new StringBuilder(words[i]);
        
        for(int k=i+1;k<j;k++){
            sb.append(" " + words[k]);
        }
        
        sb.append(" ".repeat(spacesOnRight));
        return sb.toString();
    }
}

// this is an 
// example of text 
// justification.  