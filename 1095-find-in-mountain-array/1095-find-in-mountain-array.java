/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length(), left ,right , peak = 0, mid ;
         right = n-1;
        left = 0;
        while(left<right){
            mid = (left+right)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                left = peak = mid+1;
            }else{
                right = mid;
            }
        }
        
        // search space - left of peak
         left = 0;
        right = peak;
        while(left<=right){
            mid = (left+right)/2;
            if(mountainArr.get(mid)>target){
                right = mid-1;
            }else if(mountainArr.get(mid)<target){
                left = mid +1;
            }else{
                return mid;
            }
        }
        
        // search space - right of peak
        
        
         left = peak;
        right = mountainArr.length()-1 ;
        while(left<=right){
            mid = (left+right)/2;
            if(mountainArr.get(mid)<target){
                right = mid-1;
            }else if(mountainArr.get(mid)>target){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
        
    }
}