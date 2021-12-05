class Solution {
public:
    int search(vector<int>& nums, int target) 
    {
            int l = 0, r = nums.size()-1;
            while(l <= r)
            {
                int mid = (r - l)/2 + l;
                int comparator = nums[mid];
                // Checking if both target and nums[mid] are on same side.
                if((target < nums[0]) && (nums[mid] < nums[0]) || (target >= nums[0]) && (nums[mid] >= nums[0]))
                    comparator = nums[mid];
                else
                {
                    // Trying to figure out where nums[mid] is and making comparator as -INF or INF
                    if(target <nums[0])
                        comparator = INT_MIN;
                    else 
                        comparator = INT_MAX;

                }
                if(target == comparator) return mid;
                if(target > comparator)            
                    l = mid+1;            
                else
                    r = mid-1;

            }
            return -1;
    }
};