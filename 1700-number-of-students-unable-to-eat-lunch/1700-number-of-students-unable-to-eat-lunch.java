class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones = 0, zeros = 0;
        for(int stu:students){
            if(stu == 0){
                zeros++;
            }else{
                ones++;
            }
        }
        
        for(int val:sandwiches){
            if(val == 0){
                if(zeros == 0){
                    return ones;
                }
                zeros--;
            }else if(val == 1){
                if(ones == 0){
                    return zeros;
                }
                ones--;
            }
        }
        return 0;
    }
}