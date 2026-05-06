class LRUCache {
    Node head = new Node(); 
    Node tail = new Node();
    int cpa;
    HashMap<Integer, Node> map;

    public LRUCache(int capacity) {
        cpa = capacity;
        map = new HashMap<>(cpa);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int res = -1;
        Node new_node = map.get(key);
        if(new_node != null)
        {
            res = new_node.val;
            remove(new_node);
            add(new_node);
        }
        return res;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node!=null)
        {
            node.val = value;
            remove(node);  
            add(node);
        } else {
            if(map.size() == cpa)
            {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;
            map.put(key, new_node);
            add(new_node);
        }
    }

    public void add(Node node) {
        Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;
    }

    public void remove(Node node) {
        Node nextnode = node.next;
        Node prevnode = node.prev;

        prevnode.next = nextnode;
        nextnode.prev = prevnode;
    }

    class Node{
        int key;
        int val;
        Node next;
        Node prev;
    }
}
