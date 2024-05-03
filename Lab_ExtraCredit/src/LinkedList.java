
//LinkedList from Lab08 based on Professor Alrajab's code
public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int capacity){
        this.size = capacity;
    }

    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        ++size;
    }

    public void prepend(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        ++size;
    }

    public void insertAfter(Node currentNode, Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else if (currentNode == tail) {
            tail.next = newNode;
            tail = newNode;
        }
        else {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        ++size;
    }

    public void removeAfter(Node currentNode) {
        if (currentNode == null && head != null) {
            // Special case: remove head
            Node succeedingNode = head.next;
            head = succeedingNode;
            if (succeedingNode == null) {
                // Last item was removed
                tail = null;
            }
        }
        else if (currentNode.next != null) {
            Node succeedingNode = currentNode.next.next;
            currentNode.next = succeedingNode;
            if (succeedingNode == null) {
                // Remove tail
                tail = currentNode;
            }
        }
        --size;
    }

    public void printList(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " " );
            currentNode = currentNode.next;
        }
    }
    public void addNode(String d){
        Node newNode = new Node(d);
        append(newNode);
    }

    public LinkedList(LinkedList list) {
        Node currentNode = list.head;
        while(currentNode != null){
            Node newNode = new Node(currentNode.data);
            append(newNode);
            currentNode = currentNode.next;
        }
    }
}
