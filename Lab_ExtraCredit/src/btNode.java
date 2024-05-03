public class btNode {

    private btNode left;
    private btNode right;
    private Integer data;

    public btNode(Integer data) {
        this.data = data;
    }

    public btNode getLeft() {
        return left;
    }

    public void setLeft(btNode left) {
        this.left = left;
    }

    public btNode getRight() {
        return right;
    }

    public void setRight(btNode right) {
        this.right = right;
    }

    public Integer getData() {
        return data;
    }

}
