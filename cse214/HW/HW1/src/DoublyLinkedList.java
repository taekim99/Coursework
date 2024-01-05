public class DoublyLinkedList<E> {
    public DoublyLinkedListIterator<E> iterator() {
        return new DoublyLinkedListIterator<>(this);
    }
    protected static class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;
        Node() {}
        Node(E element) {
            this.element = element;
        }
    }
    Node<E> head;
    Node<E> tail;
    int size;
    public DoublyLinkedList() {}
    public boolean add(E element) {
        Node<E> newNode = new Node<E>(element);
        if (head == null) {
            head = newNode;
            tail = head;
            size++;
            return true;
        }

        Node<E> current = head;
        while (current.next != null) {
            current = current.next;
        }
        tail = newNode;
        current.next = tail;
        tail.previous = current;
        size++;
        return true;
    }
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if (index == 0)
            return head.element;
        if (index == this.size - 1)
            return tail.element;
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.element;
        }
    }
    public E getFirst() {
        if (this.head == null)
            throw new IllegalStateException("There is no head!");
        return this.head.element;
    }
    public E getLast() {
        if (this.tail == null)
            throw new IllegalStateException("There is no tail!");
        return this.tail.element;
    }
    public E set(int index, E element) {
        Node<E> current = head;
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        E previousElement = current.element; // store the previous element
        current.element = element; // replace with the new element
        return previousElement; // return the previous element
    }
    public E setFirst(E element) {
        E previousHead = head.element;
        head.element = element;
        return previousHead;
    }
    public E setLast(E element) {
        E previousTail = tail.element;
        tail.element = element;
        return previousTail;
    }
    public void add(int index, E element) {
        if (index < 0 || index > this.size() - 1)
            throw new IndexOutOfBoundsException();

        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            size++;
            return;
        }

        if (index == size - 1) {
            this.add(element);
            return;
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        newNode.next = current;
        current.previous.next = newNode;
        newNode.previous = current.previous;
        current.previous = newNode;
        size++;
    }
    public void addFirst(E element) {
        if (this.head == null) {
            this.add(element);
            return;
        }

        Node<E> newNode = new Node<>(element);
        newNode.next = this.head;
        this.head.previous = newNode;
        this.head = newNode;
        size++;
    }
    public void addLast(E element) {
        if (this.tail == null) {
            this.add(element);
            return;
        }

        Node<E> newNode = new Node<>(element);
        this.tail.next = newNode;
        newNode.previous = this.tail;
        this.tail = newNode;
        size++;
    }
    public void remove(int index) {
        if (index < 0 || index > this.size - 1)
            throw new IndexOutOfBoundsException();

        Node<E> current = head;
        if (index == 0) {
            head = head.next;
            head.next.previous = head;
            head.previous = null;
            size--;
            return;
        }

        if (index == size - 1) {
            tail = this.tail.previous;
            tail.next = null;
            size--;
            return;
        }

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.previous.next = current.next;
        current.next.previous = current.previous;
        size--;
    }
    public void removeFirst() {
        if (this.head == null)
            throw new IndexOutOfBoundsException();

        this.head = head.next;
        head.previous = null;
        size--;
    }
    public void removeLast() {
        if (this.head == null)
            throw new IndexOutOfBoundsException();

        this.tail = this.tail.previous;
        this.tail.next = null;
        size--;
    }
    public boolean remove(E element) {
        Node<E> current = head;
        while (current != null) {
            if ((current.element).equals(element)) {
                if (current.previous == null) {
                    head = current.next;
                    head.previous = null;
                    size--;
                } else if (current.next == null) {
                    tail = current.previous;
                    tail.next = null;
                    size--;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                    size--;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return (size == 0);
    }
    public boolean contains(E element) {
        Node<E> current = head;
        while (current != null) {
            if ((current.element).equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void print() {
        Node<E> current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println("\n--------------------");
    }
    // Test Case
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        DoublyLinkedListIterator<Integer> iterator = list.iterator();
        iterator.add(100);
        list.print();
        System.out.println(list.getFirst());
        System.out.println(list.size());
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        iterator.add(500);
        list.print();
        System.out.println(iterator.next());

        iterator.previous();
        iterator.previous();
        iterator.add(222);
        list.print();

        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }

        System.out.println();
        iterator.remove();
        list.print();
        System.out.println(list.getFirst());

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        iterator.remove();
        list.print();

        iterator.previous();
        iterator.previous();
        System.out.println(iterator.previous());
        iterator.remove();

        list.print();

        System.out.println(list.size());

        System.out.println(list.toString());
    }
}