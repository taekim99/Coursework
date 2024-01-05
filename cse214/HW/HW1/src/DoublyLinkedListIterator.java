import java.util.NoSuchElementException;
public class DoublyLinkedListIterator<E>{
    DoublyLinkedList<E> list;
    DoublyLinkedList.Node<E> current;
    public DoublyLinkedListIterator(DoublyLinkedList<E> list) {
        this.list = list;
        current = this.list.head;
    }
    public boolean hasNext() {
        if (current.next != null)
            return true;
        else
            return false;
    }
    public E next() throws NoSuchElementException {
        if (!this.hasNext())
            throw new NoSuchElementException();
        current = current.next;
        return current.element;
    }
    public boolean hasPrevious() {
        if (current.previous != null)
            return true;
        else
            return false;
    }
    public E previous() {
        if (!this.hasPrevious())
            throw new NoSuchElementException();
        current = current.previous;
        return current.element;
    }
    public void add(E element) {
        DoublyLinkedList.Node<E> newNode = new DoublyLinkedList.Node<>(element);
        if (current == null) {
            current = newNode;

            list.head = current;
            list.tail = current;
            list.size++;
            return;
        }

        if (current.previous == null) {
            newNode.next = list.head.next;
            list.head.next.previous = newNode;
            list.head.next = newNode;
            newNode.previous = list.head;
            list.size++;
            return;
        }

        if (current.next == null) {
            list.tail.next = newNode;
            newNode.previous = list.tail;
            list.tail = newNode;
            list.size++;
            return;
        }

        current.next.previous = newNode;
        newNode.next = current.next;
        current.next = newNode;
        newNode.previous = current;
        current = newNode;
        list.size++;
    }
    public void set(E element) {
        current.element = element;
    }
    public void remove() {
        if (current.previous == null) {
            current = current.next;
            list.removeFirst();
            return;
        }

        if (current.next == null) {
            current = current.previous;
            list.removeLast();
            return;
        }

        current.previous.next = current.next;
        current.next.previous = current.previous;
        list.size--;
    }
}