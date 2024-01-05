package Rec6;
import java.util.Stack;
public class SomeStack<E> extends Stack<E>{
    public E peekTwice() {
        if (this.size() == 0)
            throw new IllegalArgumentException();
        E temp = this.pop();
        E temp2 = this.peek();
        this.push(temp);
        return temp2;
    }
    public static void main(String[] args) {
        SomeStack<Integer> stack = new SomeStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("peek twice: " + stack.peekTwice()); // 4
        System.out.println("pop the last item: " + stack.pop()); // 5
        System.out.println("peek twice: " + stack.peekTwice()); // 3
    }
}
