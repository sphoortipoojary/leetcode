class DoublyLinkedList{
    public String val;
    public DoublyLinkedList prev;
    public DoublyLinkedList next;
    DoublyLinkedList(String data){
        val = data;
        prev = null;
        next = null;
    }
}
class BrowserHistory {
    private DoublyLinkedList head;
    private DoublyLinkedList curr;

    public BrowserHistory(String homepage) {
        head = new DoublyLinkedList(homepage);
        curr = head;
    }

    public void visit(String url) {
        DoublyLinkedList newNode = new DoublyLinkedList(url);
        curr.next = newNode;
        newNode.prev= curr;
        curr = newNode;
    }

    public String back(int steps) {
        while(steps > 0 && curr.prev != null){
            curr = curr.prev;
            steps--;
        }
        return curr.val;
    }

    public String forward(int steps) {
        while(steps > 0 && curr.next != null){
            curr = curr.next;
            steps--;
        }
        return curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
