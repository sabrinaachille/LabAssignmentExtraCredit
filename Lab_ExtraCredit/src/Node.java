//Node from Lab08 based on Professor Alrajab's code
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    //accessor for the node's data
    public T getData(){
        return data;
    }
    //accessor for the data of the nest node
    public T getNextData(){
        return next.getData();
    }
}