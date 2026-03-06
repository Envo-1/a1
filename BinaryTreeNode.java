public class BinaryTreeNode<PlaceNameEntry> {
    private PlaceNameEntry data;
    private BinaryTreeNode<PlaceNameEntry> left;
    private BinaryTreeNode<PlaceNameEntry> right;

    public BinaryTreeNode(PlaceNameEntry data, BinaryTreeNode<PlaceNameEntry> l, BinaryTreeNode<PlaceNameEntry> r) {
        this.data = data;
        this.left = l;
        this.right = r;
    }

    public PlaceNameEntry getData() {
        return data;
    }

    public BinaryTreeNode<PlaceNameEntry> getLeft() {
        return left;
    }

    public BinaryTreeNode<PlaceNameEntry> getRight() {
        return right;
    }

    public void setLeft(BinaryTreeNode<PlaceNameEntry> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<PlaceNameEntry> right) {
        this.right = right;
    }
}
