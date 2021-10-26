class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list,new ArrayList<>(),candidates,target,0);
        return list;
    }
    
    public static void backtrack(List<List<Integer>> list,List<Integer> temp,int[] arr,int remain,int start ){
        if(remain<0){
            return;
        }else if(remain==0){
            list.add(new ArrayList<Integer>(temp));
        }else{
            for(int i=start;i<arr.length;i++){
                if(i>start && arr[i]==arr[i-1]  ){
                    continue;
                }
                temp.add(arr[i]);
                backtrack(list,temp,arr,remain-arr[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    
}