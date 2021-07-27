class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
            ans.add(1);
            for(int j=i-1;j>0;j--){
                ans.set(j,ans.get(j-1)+ans.get(j));
            }
        }
        return ans;
    }
}