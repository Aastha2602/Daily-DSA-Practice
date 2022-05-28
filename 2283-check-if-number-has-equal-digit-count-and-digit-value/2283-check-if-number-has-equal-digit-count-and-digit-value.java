class Solution {
//     public boolean digitCount(String num) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<num.length();i++){
//            int ch = num.charAt(i) - '0';
//             if(map.containsKey(ch)){
//                 map.put(ch, map.getOrDefault(ch, 0) + 1);              
//             }else{
//                 map.put(ch, 1);
//             }
//         }
        
//         for(int i=0;i<num.length();i++){
//             if((int)map.get(i) != (int)num.charAt(i)){
//                 // System.out.println( i + " " + map.get(i) + " " + num.charAt(i));
//                 return false;
//             }
//         }
//         return true;
//     }
    
    public boolean digitCount(String num){
        int[] indexCount = new int[10];
        
        for(char ch : num.toCharArray()){
            indexCount[ch - '0']++;
        }
        
        for(int i=0;i<num.length();i++){
            if(Character.getNumericValue(num.charAt(i)) != indexCount[i] ){
                return false;
            }
        }
     return true;   
    }
}