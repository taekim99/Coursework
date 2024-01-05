package Rec7;
public class BinaryTree<E> {
    private E element;
    private BinaryTree<E> left;
    private BinaryTree<E> right;
    public BinaryTree(E e) {
        this.element = e;
        this.left = null;
        this.right = null;
    }
    public E getElement() {
        return this.element;
    }
    public void setElement(E e) {
        this.element = e;
    }
    public BinaryTree<E> getLeft() {
        return this.left;
    }
    public void setLeft(BinaryTree<E> left) {
        this.left = left;
    }
    public BinaryTree<E> getRight() {
        return this.right;
    }
    public void setRight(BinaryTree<E> right) {
        this.right = right;
    }
    /**
     * inorder (left, root, right)
     * Base: tree == null
     * Think about the base case first always when code recursions!
     * */
    public void inorder(BinaryTree<E> tree) {
       if (tree == null)
           return;

       this.inorder(tree.getLeft());
       System.out.print(tree.getElement() + " ");
       this.inorder(tree.getRight());
    }
    // preorder (root, left, right)
    public void preorder(BinaryTree<E> tree) {
        if (tree == null)
            return;
        System.out.print(tree.getElement() + " ");
        this.preorder(tree.getLeft());
        this.preorder(tree.getRight());
    }
    // postorder (left, right, root)
    public void postorder(BinaryTree<E> tree) {
        if (tree == null)
            return;

        this.postorder(tree.getLeft());
        this.postorder(tree.getRight());
        System.out.print(tree.getElement() + " ");
    }

    public static void main(String[] args) {
        BinaryTree<String> b = new BinaryTree<>("root");
        BinaryTree<String> b2 = new BinaryTree<>("left");
        BinaryTree<String> b3 = new BinaryTree<>("right");
        BinaryTree<String> b4 = new BinaryTree<>("1");
        BinaryTree<String> b5 = new BinaryTree<>("2");
        BinaryTree<String> b6 = new BinaryTree<>("3");
        BinaryTree<String> b7 = new BinaryTree<>("4");

        b.setLeft(b2);
        b.setRight(b3);

        b2.setLeft(b4);
        b2.setRight(b5);
        b3.setLeft(b6);
        b3.setRight(b7);

        b.inorder(b); // 1 left 2 root 3 right 4
        System.out.println();
        b.preorder(b); // root left 1 2 right 3 4
        System.out.println();
        b.postorder(b); // 1 2 left 3 4 right root
    }
}
