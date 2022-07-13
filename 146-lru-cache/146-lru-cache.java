// head -- mru element -- other elements -- lru element -- tail

// we insert everything to the right after head 
// lru is the element just before the tail 

// hashmap will contain key along with the address of that node

class LRUCache {
    class Node{
        Node prev, next;
        int key, value;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    
    Node head = new Node(0,0), tail = new Node(0,0);
    HashMap<Integer,Node> map = new HashMap<>();
    int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if( map.containsKey(key) ){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }
    }
    
    // if the cache is full, lru element needs to be removed that is "tail.prev" will be removed
    public void put(int key, int value) {
        if( map.containsKey(key) ){
            remove(map.get(key));
        }
        if(map.size() == capacity ){
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    
    // when the current pointer is on the node to be deleted, just cut and join the required edges 
    private void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // inserting to the just right of the head
    private void insert(Node node){
        map.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        head.next = node;
        node.prev = head;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */