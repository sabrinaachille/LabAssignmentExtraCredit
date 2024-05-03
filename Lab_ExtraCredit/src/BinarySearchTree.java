public class BinarySearchTree {
    private btNode root;
    public static int nodeNotDivBySev(btNode root){
        int count = 0;
        if(root == null){
            return 0;
        }
        if(root.getData()%7 != 0) {
            count += 1;
        }
        count += nodeNotDivBySev(root.getRight());
        count += nodeNotDivBySev(root.getLeft());
        return count;
    }
}
