package Rec8;
import java.util.ArrayList;
public class Rec8 {
    public class DoublyLinkedList<E> {
        E head; // the first element
        DoublyLinkedList<E> tail; // the rest of the list

        @Override
        public boolean equals(Object o) {
           if (this == o)
               return true;
           if (!(o instanceof DoublyLinkedList))
               return false;

           DoublyLinkedList<E> that = (DoublyLinkedList<E>) o;
           if (this.head == null && that.head != null)
               return false;
           if (this.head != null && !this.head.equals(that.head))
               return false;
           if (this.tail == null && that.tail != null)
               return false;
           if (this.tail != null && !this.tail.equals(that.tail))
               return false;
           return true;
        }
    }

    public class Contact {
        String name;
        String phoneNumber;
        String email;

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o != null && this.getClass() != o.getClass())
                return false;

            Contact that = (Contact) o;
            if (!this.name.equals(that.name))
                return false;
            if (!this.phoneNumber.equals(that.phoneNumber))
                return false;
            if (!this.email.equals(that.email))
                return false;
            return true;
        }
    }

    public static void main(String[] args) {
        Rec8 r = new Rec8();
        DoublyLinkedList<Integer> d = r.new DoublyLinkedList<>();
        d.head = 1;
        DoublyLinkedList<Integer> d2 = r.new DoublyLinkedList<>();
        d2.head = 2;
        d.tail = d2;

        DoublyLinkedList<Integer> dd = r.new DoublyLinkedList<>();
        dd.head = 1;
        DoublyLinkedList<Integer> dd2 = r.new DoublyLinkedList<>();
        dd2.head = 2;
        dd.tail = dd2;

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);

        System.out.println("d with dd: " + d.equals(dd));
        System.out.println("d with a: " + d.equals(a));

        Contact c = r.new Contact();
        c.name = "Tae";
        c.phoneNumber = "6313107472";
        c.email = "taehyuk.kim";

        Contact c2 = r.new Contact();
        c2.name = "Tae";
        c2.phoneNumber = "6313107472";
        c2.email = "taehyuk.kim";

        System.out.println(c.equals(c2));
    }
}
