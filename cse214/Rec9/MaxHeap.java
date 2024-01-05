package Rec9;
import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    private List<Integer> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    // get the index of the parent node
    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    // swap
    private void swap(int firstPos, int secondPos) {
        int tmp = heap.get(firstPos);
        heap.set(firstPos, heap.get(secondPos));
        heap.set(secondPos, tmp);
    }

    // increase priority
    public void increasePriority(int location, int increaseBy) {
        // Bounds check
        if (location < 0 || location >= heap.size()) {
            throw new IndexOutOfBoundsException("Location out of bounds of heap.");
        }

        // Increase the value
        heap.set(location, heap.get(location) + increaseBy);

        // Fix the max-heap property if it's violated
        while (location != 0 && heap.get(parent(location)) < heap.get(location)) {
            swap(location, parent(location));
            location = parent(location);
        }
    }

    public void insert(int value) {
        heap.add(value);

        int index = heap.size() - 1;
        while (index != 0 && heap.get(parent(index)) < heap.get(index)) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public int getMax() {
        if (heap.size() == 0) {
            throw new IllegalStateException("Heap is empty.");
        }
        return heap.get(0);
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);

        System.out.println("Max value: " + maxHeap.getMax()); // print 30

        maxHeap.increasePriority(2, 20); // increase priority of value 15 by 20 --> making it 35

        System.out.println("Max value: " + maxHeap.getMax()); // print 35
    }
}