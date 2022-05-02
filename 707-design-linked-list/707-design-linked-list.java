class MyLinkedList {
    
    private class Node{
        int data = 0;
        Node next = null;
        
        Node(int data){
            this.data = data;
        }
    } 
    
    private Node head = null, tail = null;
    private int size = 0;

    public MyLinkedList() {
        
    }
    
    private Node getNodeAt(int idx){
        Node current = this.head;
        while(idx-- >0 ){
            current = current.next;
        }
        return current;
    }
    
    public int get(int index) {
        if(index<0 || index>=this.size){
            return -1;
        }
        return getNodeAt(index).data;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(this.head == null ){
            this.head = this.tail = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
        this.size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(this.head == null ){
            this.head = this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>this.size){
            return;
        }
        
        if(index == 0){
            addAtHead(val);
        }else if(index == this.size ){
            addAtTail(val);
        }else{
            Node prev = getNodeAt(index-1);
            Node node = new Node(val);
            Node nextNode = prev.next;
            prev.next = node;
            node.next = nextNode;
            this.size++;
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>= this.size){
            return;
        }
        
        if(this.size == 1){
            this.head = this.tail = null;
        }else if( index == 0 ){
            Node rn = this.head;
            this.head = rn.next;
            rn.next = null;
        }else if( index == this.size-1 ){ // tail
            Node prev = getNodeAt(index-1);
            this.tail = prev;
            prev.next = null;
        }else{
            Node prev = getNodeAt(index-1);
            Node rn = prev.next;
            prev.next = rn.next;
            rn.next = null;
            
            if(rn == this.tail){
                this.tail = prev;
            }
        }
        
        this.size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */