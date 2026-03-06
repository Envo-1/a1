
public class BinaryTreeNode<PlaceNameEntry> {

    private final PlaceNameEntry data;
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

    public int getHeight(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return 1 + Math.max(getHeight(left), getHeight(right));
        }
    }
}

    