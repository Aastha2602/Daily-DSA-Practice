class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(right.size()>0 && num>right.peek()){
            right.add(num);
        }else{
            left.add(num);
        }
        
        handlegap();
    }
    
    public void handlegap(){
        if(left.size()-right.size()>=2){
            int val=left.remove();
            right.add(val);
        }else if(right.size()-left.size()>=2){
            int val=right.remove();
            left.add(val);
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size()){
            return (double)left.peek();
        }else if(left.size()==right.size()){
            double ans = (double) ( left.peek() + right.peek() )/2.0;
            return ans;
        }
        return (double)right.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */