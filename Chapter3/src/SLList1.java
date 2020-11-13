public class SLList1 {

    private static class IntNode {
        public int data;
        public IntNode next;

        public IntNode(int value, IntNode n) {
            this.data = value;
            this.next = n;
        }
    }

    private int size;
    private IntNode sentinel;

    public SLList1() {
        sentinel = new IntNode(0, null);
        size = 0;

    }

    public SLList1(int value) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(value, null);
        size = 1;
    }

    public void addFirst(int value) {
        sentinel.next = new IntNode(value, sentinel.next);
        size += 1;
    }

    public void getFirst() {
        System.out.println(sentinel.next.data);
    }

    public void addLast(int value) {
        IntNode p = sentinel;
        IntNode last = new IntNode(value, null);
        while (p.next != null) {
            p = p.next;
        }
        p.next = last;
        size += 1;
    }

    public void getLast() {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        System.out.println(p.data);
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        SLList1 s = new SLList1();
        s.addFirst(5);
        s.addFirst(10);
        s.addFirst(20);
        s.addLast(12);
        s.getFirst();
        s.getLast();
        System.out.println(s.size());
    }

}
