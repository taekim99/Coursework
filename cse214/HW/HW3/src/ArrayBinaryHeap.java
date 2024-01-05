import java.util.ArrayList;
public class ArrayBinaryHeap<E extends Comparable<E>> extends ArrayList<E> {
    public void addToPriorityQueue(E element) {
        this.add(element); // add at the end of the array
        int indexOfLast = this.size() - 1; // address of the last element
        int indexOfParent = (int)(Math.floor((indexOfLast - 1) / 2.0)); // address of the parent of the last element
        E parent = this.get(indexOfParent);

        while (element.compareTo(parent) > 0) {
            /*
             * make the code easier to read.
             * here I use a private swapElement method
             * because I want to concentrate on the main task of 'addToPriorityQueue' method.
             * */
            swapElement(indexOfLast, indexOfParent);
            indexOfLast = indexOfParent;
            indexOfParent = (int)(Math.floor((indexOfLast - 1) / 2.0));
            parent = this.get(indexOfParent);
        }
    }
    private void swapElement(int indexOfLast, int indexOfParent) {
        E temp = this.get(indexOfLast);
        this.set(indexOfLast, this.get(indexOfParent));
        this.set(indexOfParent, temp);
    }
    /*
     * remove the element in the top of the heap
     * and return the removed value.
     * */
    public E removeFromPriorityQueue() {
        E top = this.get(0); // value to be returned
        int indexOfLast = this.size() - 1;
        this.set(0, this.get(indexOfLast)); // change the value in the top of the heap
        this.remove(indexOfLast); // remove the last value in the heap

        int currentIndex = 0;
        E current = this.get(0);
        int highestValueChildIndex = this.getHighestValueChildIndex(0);
        E highestValueChild = this.get(highestValueChildIndex);

        while (current.compareTo(highestValueChild) < 0) {
            swapElement(currentIndex, highestValueChildIndex);

            currentIndex = highestValueChildIndex;
            highestValueChildIndex = this.getHighestValueChildIndex(currentIndex);
            highestValueChild = this.get(highestValueChildIndex);
        }
        return top;
    }
    private int getHighestValueChildIndex(int indexOfParent) {
        if (this.size() - 1 < indexOfParent * 2 + 1 && this.size() < indexOfParent * 2 + 2)
            return indexOfParent;
        else if (this.size() - 1 < indexOfParent * 2 + 1)
            return indexOfParent * 2 + 2;
        else if (this.size() - 1 < indexOfParent * 2 + 2)
            return indexOfParent * 2 + 1;

        E left = this.get(indexOfParent * 2 + 1);
        E right = this.get(indexOfParent * 2 + 2);
        if (left.compareTo(right) > 0)
            return indexOfParent * 2 + 1;
        else
            return indexOfParent * 2 + 2;
    }
    public String toString() {
        return super.toString();
    }
    // Test Case
    public static void main(String[] args) {
        ArrayBinaryHeap<Integer> abh = new ArrayBinaryHeap<>();
        abh.add(45);
        abh.add(35);
        abh.add(23);
        abh.add(27);
        abh.add(21);
        abh.add(22);
        abh.add(4);
        abh.add(19);
        abh.add(5);

        System.out.println(abh.toString());

        abh.addToPriorityQueue(42);
        System.out.println(abh.toString());

        System.out.println(abh.removeFromPriorityQueue());
        System.out.println(abh.toString());
    }
}