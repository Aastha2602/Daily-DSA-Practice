class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length-1, count = 0;
        while(left < right){
            int boat = people[left] + people[right];
            if( boat <= limit ){
                count++;
                left++;
                right--;
            }else{
                count++;
                right--;
            }
        }
        
        if(left == right){
            count++;
        }
        
        return count;
    }
}