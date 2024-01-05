import java.util.ArrayList;
import java.util.List;

public class ComparableBST<E extends Comparable<E>> {
    private E data;
    private ComparableBST<E> left;
    private ComparableBST<E> right;
    private ComparableBST<E> parent;
    private int size; // ?
    public ComparableBST() {}
    public ComparableBST(E data) {
        this.data = data;
    }
    public boolean search(E data) {
        if (data == null)
            throw new IllegalArgumentException();

        if (this.data.equals(data))
            return true;
        else if (this.data.compareTo(data) > 0) {
            if (this.left == null)
                return false;
            else
                return this.left.search(data);
        } else {
            if (this.right == null)
                return false;
            else
                return this.right.search(data);
        }
    }
    public boolean insert(E data) {
        if (data == null)
            throw new IllegalArgumentException();
        if (this.data == null) {
            this.data = data;
            return true;
        }
        if (this.search(data))
            return false;

        if (this.data.compareTo(data) > 0) {
            if (this.left == null) {
                this.left = new ComparableBST<>(data);
                this.left.parent = this;
                return true;
            } else
                return this.left.insert(data);
        } else {
            if (this.right == null) {
                this.right = new ComparableBST<>(data);
                this.right.parent = this;
                return true;
            } else
                return this.right.insert(data);
        }
    }
    private ComparableBST<E> min() {
        if (this.left == null)
            return this;
        else
            return this.left.min();
    }
    private ComparableBST<E> successor(ComparableBST<E> root) {
        if (root.right != null)
            return root.right.min();
        else {
            while (root.data.equals(root.parent.right.data)) {
                root = root.parent;
            }
            return root.parent;
        }
    }
    public boolean remove(E data) {
        if (data == null)
            throw new IllegalArgumentException();
        if (!this.search(data)) {
            return false;
        }

        if (this.data.compareTo(data) > 0)
            return this.left.remove(data);
        else if (this.data.compareTo(data) < 0)
            return this.right.remove(data);
        else {
            // does not have a node
            if (this.left == null && this.right == null) {
                if (this.parent.right.data == data) {
                    this.parent.right = null;
                    return true;
                }
                if (this.parent.left.data == data) {
                    this.parent.left = null;
                    return true;
                } else
                    throw new IllegalArgumentException();
            }
            // has one node
            if (this.left == null) {
                this.parent.right = this.right;
                return true;
            }
            if (this.right == null) {
                this.parent.left = this.left;
                return true;
            }
            // has two nodes
            E temp = this.successor(this).data;
            this.remove(temp);
            this.data = temp;
            return true;
        }
    }
    public static void printComparableBST(ComparableBST<?> node) {
        List<List<String>> lines = new ArrayList<>();
        List<ComparableBST<?>> level = new ArrayList<>();
        List<ComparableBST<?>> next = new ArrayList<>();

        level.add(node);
        int nn = 1;
        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<>();
            nn = 0;

            for (ComparableBST<?> n : level) {
                if (n == null) {
                    line.add(null);
                    next.add(null);
                    next.add(null);
                } else {
                    String aa = n.data != null ? n.data.toString() : "null";
                    line.add(aa);

                    if (aa.length() > widest) {
                        widest = aa.length();
                    }

                    next.add(n.left);
                    next.add(n.right);

                    if (n.left != null) nn++;
                    if (n.right != null) nn++;
                }
            }

            if (widest % 2 == 1) {
                widest++;
            }

            lines.add(line);

            List<ComparableBST<?>> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perpiece = lines.get(lines.size() - 1).size() * (widest + 4);

        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perpiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '┴' : '┘';
                        } else {
                            if (j < line.size() && line.get(j) != null) c = '└';
                        }
                    }
                    System.out.print(c);

                    if (line.get(j) == null) {
                        for (int k = 0; k < perpiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "─");
                        }
                        System.out.print(j % 2 == 0 ? "┌" : "┐");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "─" : " ");
                        }
                    }
                }
                System.out.println();
            }

            for (String f : line) {
                if (f == null) f = "";
                final float a = perpiece / 2f - f.length() / 2f;
                int gap1 = (int) Math.ceil(a);
                int gap2 = (int) Math.floor(a);

                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            perpiece /= 2;
        }
    }

    public static void main(String[] args) {
        ComparableBST<Integer> bst = new ComparableBST<>();
        bst.insert(45);
        bst.insert(9);
        bst.insert(53);
        bst.insert(3);
        bst.insert(17);
        bst.insert(50);
        bst.insert(54);
        bst.insert(20);

        // print the binary search tree
        printComparableBST(bst);

        // remove 45
        bst.remove(45);
        System.out.println("After removal of 45");

        // print again
        printComparableBST(bst);
    }
}