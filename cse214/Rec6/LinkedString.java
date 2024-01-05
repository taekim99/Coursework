package Rec6;
import java.util.LinkedList;
public class LinkedString extends LinkedList<Character> {
    public void trim() {
        if (this.size() == 0) {
            return;
        }
        while (this.get(0) == ' ') {
            this.remove(0);
        }
        while (this.get(this.size() - 1) == ' ') {
            this.remove(this.size() - 1);
        }
    }
    public static void main(String[] args) {
        LinkedString s = new LinkedString();
        s.add(' ');
        s.add('b');
        s.add('c');
        s.add(' ');
        s.add('d');
        s.add('e');
        s.add(' ');
        System.out.println(s);
        s.trim();
        System.out.println(s);
    }
}