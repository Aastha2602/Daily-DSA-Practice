class StockPrice {

    public int latesttime;
    public HashMap<Integer,Integer> timestamppricemap;
    public PriorityQueue<int[]> minheap, maxheap;
    
    public StockPrice() {
        latesttime = 0;
        timestamppricemap = new HashMap<>();
        minheap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        maxheap = new PriorityQueue<>((a,b) -> b[0] - a[0]);
    }
    
    public void update(int timestamp, int price) {
        latesttime = Math.max(latesttime, timestamp);
        
        timestamppricemap.put( timestamp, price);
        
        minheap.add(new int[]{ price, timestamp});
        maxheap.add(new int[]{ price, timestamp});
    }
    
    public int current() {
        return timestamppricemap.get(latesttime);
    }
    
    public int maximum() {
        int[] top = maxheap.peek();
        while(timestamppricemap.get(top[1]) != top[0]){
            maxheap.remove();
            top = maxheap.peek();
        }
        
        return top[0];
    }
    
    public int minimum() {
        int[] top = minheap.peek();
        while(timestamppricemap.get(top[1]) != top[0]){
            minheap.remove();
            top = minheap.peek();
        }
        
        return top[0];
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */