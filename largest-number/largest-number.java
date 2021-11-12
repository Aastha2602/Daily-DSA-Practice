class Solution {
    public class comparator implements Comparator<String>{
        public int compare(String a,String b){
            String order1=a+b;
            String order2=b+a;
            return order2.compareTo(order1);
        }
    }
    public String largestNumber(int[] nums) {
        String[] arr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        
        
        Arrays.sort(arr,new comparator());
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        String largestNumberStr=new String();
        for(String str:arr ){
            largestNumberStr+=str;
        }
        return largestNumberStr;
    }
}