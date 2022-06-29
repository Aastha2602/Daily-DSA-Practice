class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(b[0] == a[0]){
                    return a[1] - b[1];
                }else{
                    return b[0] - a[0];
                }
            }
        });
        
        List<int[]> list = new ArrayList<>();
        
        for(int[] p:people ){
            list.add(p[1], p);
        }
        
        int n = people.length;
        return list.toArray(new int[n][2]);
    }
}