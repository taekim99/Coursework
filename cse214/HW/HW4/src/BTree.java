import javax.naming.OperationNotSupportedException;
import java.util.*;
import java.util.Collection;

public class BTree<E extends Comparable<E>> {
    private class Node {
        private int num;
        private boolean leaf;
        private LinkedList<E> values;
        private LinkedList<Node> children;
        private Node() {
            this.num = 0;
            this.leaf = true;
            this.values = new LinkedList<>();
            this.children = new LinkedList<>();
        }
        @Override
        public String toString() {
            return values.toString();
        }
    }
    public class NodeAndIndex {
        private final Node btNode;
        private final int location;
        public NodeAndIndex(Node btNode, int location) {
            this.btNode = btNode;
            this.location = location;
        }
        @Override
        public String toString() {
            return "<" + this.btNode.toString() + ", " + this.location + ">";
        }
    }
    private final int minimumDegree;
    private Node root;
    public BTree(int minimumDegree) {
        if (minimumDegree <= 0)
            throw new IllegalArgumentException("Minimum cannot be less or equal to 0!"); // CHECK
        this.minimumDegree = minimumDegree;
        this.root = new Node();
    }
    public NodeAndIndex find(E element) {
        return find(element, this.root);
    }
    private NodeAndIndex find(E element, Node node) {
        int i = 0;
        while (i < node.num && node.values.get(i).compareTo(element) < 0) {
            i++;
        }

        if (i < node.num && element.equals(node.values.get(i))) {
            return new NodeAndIndex(node, i);
        }
        if (node.leaf) {
            return null;
        }
        return find(element, node.children.get(i));
    }
    /*
     * (a) correct splitting of the root node
     * (b) upon encountering a full node, it is always split
     * (c) the addition operation works correctly for at least the simplest min value of 2.
     *
     * if the root node is full
     *   split it and increase the tree height by one
     *   call insertNonFull to insert the element
     * else
     *   call insertNonFull to insert the element
     * */
    public void add(E element) throws OperationNotSupportedException {
        // If the B-tree already contains this element, this operation has no effect on the tree (i.e., it silently ignores attempts to add duplicates).
        if (find(element) != null)
            return;

        if (this.root.num == 0) {
            this.root.values.add(element);
            this.root.num++;
            return;
        }

        if (this.root.values.size() >= (2 * minimumDegree - 1)) {
            splitRoot(this.root);
            insertNonFull(element, this.root);
        } else {
            insertNonFull(element, this.root);
        }

        // If the add operation results in a call to add the element to a non-full node while the node is actually full.
        if (this.root.values.size() > (2 * minimumDegree - 1))
            throw new OperationNotSupportedException("The node is actually full!");
    }
    private void insertNonFull(E element, Node node) {
        int i = node.num - 1;

        // if this is a leaf node, simply insert the value in the right place
        if (node.leaf) {
            while (i >= 0 && element.compareTo(node.values.get(i)) < 0) {
                i--;
            }
            node.values.add(i + 1, element);
            node.num++;
        } else { // if this is not a leaf node, things are more complicated
            // figure out the child subtree into which the insertion will descend
            while (i >= 0 && element.compareTo(node.values.get(i)) < 0) {
                i--;
            }
            i++;

            // are we descending into a child that is a full node?
            // if so, then split the node into two
            // this part ensures that the recursion never descends into a full node
            if (node.children.get(i).num >= 2 * minimumDegree - 1) {
                splitChild(node, node.children.get(i), i);
                // figure out the child subtree into which the insertion will descend
                if (element.compareTo(node.values.get(i)) > 0) {
                    i++;
                }
            }
            // now we have found the correct subtree, so recursive call
            insertNonFull(element, node.children.get(i));
        }
    }
    /*
     * make a new node
     * add the median to the new node
     * split
     * assign the new node as the root
     * */
    private void splitRoot(Node node) {
        Node newRoot = new Node();
        Node left = new Node();
        Node right = new Node();

        newRoot.values.add(node.values.get(node.num / 2));
        newRoot.num++;
        node.values.remove(node.values.size() / 2);
        node.num--;

        for (int i = 0; i < node.num; i++) {
            if (i < node.num / 2) { // should I check if get(i) is null?, check
                left.values.add(node.values.get(i));
                left.num++;
            } else {
                right.values.add(node.values.get(i));
                right.num++;
            }
        }

        for (int i = 0; i < node.children.size(); i++) {
            if (i < node.children.size() / 2)
                left.children.add(node.children.get(i)); // should I check if get(i) is null? => No, children.size() in for statement takes care of it
            else
                right.children.add(node.children.get(i));
        }
        if (!left.children.isEmpty())
            left.leaf = false;
        if (!right.children.isEmpty())
            right.leaf = false;

        if ((left.leaf && !right.leaf) || (!left.leaf && right.leaf))
            throw new IllegalArgumentException("left right leaves do not match");

        newRoot.leaf = false;
        newRoot.children.add(left);
        newRoot.children.add(right);

        sort(newRoot);

        this.root = newRoot;
    }
    private void splitChild(Node node, Node childNode, int i) {
        // add the median value of childNode to node.
        node.values.add(childNode.values.get(childNode.num / 2));
        node.num++;

        // remove the median value in the child node
        childNode.values.remove(childNode.num / 2) ;
        childNode.num--;

        //sort
        this.sort(node);

        // create new child for (i + 1) node.children
        Node newNode2 = new Node();
        int j = 0;
        // add values to it
        int m = childNode.num;
        while (j < m) {
            if ((node.values.get(i)).compareTo(childNode.values.get(j)) < 0) {
                newNode2.values.add(childNode.values.get(j));
                newNode2.num++;
            }
            j++;
        }
        // remove values from the original childNode
        j = 0;
        while (j < newNode2.num) {
            childNode.values.removeLast();
            childNode.num--;
            j++;
        }
        // add children for new child node
        j = 0;
        int n = childNode.children.size();
        while (j < n) {
            if (childNode.num < j) {
                newNode2.children.addLast(childNode.children.get(j));
                //childNode.children.remove(j);
            }
            j++;
        }
        // remove children from childNode
        j = 0;
        while (j < newNode2.children.size()) {
            childNode.children.removeLast();
            j++;
        }

        node.children.add(i + 1, newNode2);

        // check whether children of the node are leaves or not
        node.leaf = false;
        ifChildrenLeaves(node);
    }
    private void ifChildrenLeaves(Node node) {
        for (int i = 0; i < node.children.size(); i++) {
            node.children.get(i).leaf = true;
            if (!node.children.get(i).children.isEmpty())
                node.children.get(i).leaf = false;
        }
    }
    private void sort(Node node) {
        // sort node.values
        Collections.sort(node.values);
        // sort node.children
        int i, j;
        Node temp;
        boolean swapped;
        for (i = 0; i < node.children.size() - 1; i++) {
            swapped = false;
            for (j = 0; j < node.children.size() - i - 1; j++) {
                if (node.children.get(j).values.get(0).compareTo(node.children.get(j + 1).values.get(0)) > 0) {
                    // Swap arr[j] and arr[j+1]
                    temp = node.children.get(j);
                    node.children.set(j, node.children.get(j + 1));
                    node.children.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
    public void addAll(Collection<E> elements) throws OperationNotSupportedException {
        for (E e : elements)
            this.add(e);
    }
    public void show() {
        String nodesep = " ";
        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();
        queue1.add(root); /* root of the tree being added */
        while (true) {
            while (!queue1.isEmpty()) {
                Node node = queue1.poll();
                System.out.printf("%s%s", node.toString(), nodesep);
                if (!node.children.isEmpty())
                    queue2.addAll(node.children);
            }
            System.out.printf("%n");
            if (queue2.isEmpty())
                break;
            else {
                queue1 = queue2;
                queue2 = new LinkedList<>();
            }
        }
    }
    // Test Case
    public static void main(String[] args) throws OperationNotSupportedException{
        System.out.println("Minimum Degree: 5");
        BTree<Integer> tree4 = new BTree<>(5);
        tree4.addAll(Arrays.asList(50, 30, 70, 20, 40, 60, 80, 15, 25, 35,
                45, 55, 65, 75, 85, 10, 5, 3, 7, 13,
                17, 23, 27, 33, 37, 43, 47, 53, 57, 63,
                67, 73, 77, 83, 87, 90, 95, 97, 100, 1,
                2, 4, 6, 8, 9, 11, 12, 14, 16, 18, 19));
        tree4.show();
        System.out.println("-------------------Find 27: " + tree4.find(27));
        System.out.println("-------------------Find 95: " + tree4.find(95));
        System.out.println("-------------------Find 100: " + tree4.find(100));
        System.out.println("-------------------Find 0: " + tree4.find(0));
        System.out.println();
    }
}