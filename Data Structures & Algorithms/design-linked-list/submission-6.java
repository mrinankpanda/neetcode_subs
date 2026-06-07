class MyLinkedList {

    ListNode head;
    int size;

    public MyLinkedList() {
        this.head = new ListNode(0);
        size = 0;
    }
    
    public int get(int index) {
        if (index >= size) return -1; 
        ListNode cur = head.next; 
        for (int i = 0; i < index; i++) {
            cur = cur.next; 
        }
        return cur.val; 
    }
    
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head.next; 
        head.next = node; 
        size++; 
    }
    
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode cur = head; 
        while (cur.next != null) {
            cur = cur.next; 
        }
        cur.next = node; 
        size++; 
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        ListNode cur = head; 
        for (int i = 0; i < index; i++) {
            cur = cur.next; 
        }
        ListNode node = new ListNode(val); 
        node.next = cur.next; 
        cur.next = node; 
        size++; 
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size) return; 
        ListNode cur = head; 
        for (int i = 0; i < index; i++) {
            cur = cur.next; 
        }
        cur.next = cur.next.next; 
        size--; 
    }
}

class ListNode {
    ListNode next; 
    int val; 

    public ListNode() {
        this.val = -1; 
        this.next = null; 
    }

    public ListNode(int val) {
        this.val = val; 
        this.next = null; 
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