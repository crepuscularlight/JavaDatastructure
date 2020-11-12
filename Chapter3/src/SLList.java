public class SLList {
    public IntNode first;

    public SLList(int value) {
        this.first = new IntNode(value, null);
    }

    public void addFirst(int value) {
        first = new IntNode(value, first);
    }

    public void getFirst() {
        System.out.println(first.data);
    }

    public void addLast(int value) {
        IntNode last = new IntNode(value, null);
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = last;
    }

    public void getLast() {
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        System.out.println(p.data);
    }

    public static void main(String[] args) {
        SLList a = new SLList(5);
        a.addFirst(10);
        a.addFirst(15);
        a.addLast(12);
        a.getFirst();
        a.getLast();
    }
}
