public class CDDList {
    //define the node
    public class IntNode {
        int data;
        IntNode prev;
        IntNode next;

        public IntNode(int value, IntNode prev, IntNode next) {
            this.data = value;
            this.prev = prev;
            this.next = next;
        }
    }

    //define the member of the link list
    public int size;
    public IntNode sentinel;

    //define the constructor
    public CDDList() {
        size = 0;
        sentinel = new IntNode(0, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    public CDDList(int value) {
        sentinel = new IntNode(0, null, null);
        IntNode first = new IntNode(value, null, null);

        sentinel.next = first;
        sentinel.prev = first;

        first.prev = sentinel;
        first.next = sentinel;

        size = 1;
    }

    public void addFirst(int value) {
        IntNode first = new IntNode(value, null, null);
        first.next = sentinel.next;
        first.prev = sentinel;

        sentinel.next.prev = first;
        sentinel.next = first;
        size += 1;
    }

    public void getFirst() {
        System.out.println(sentinel.next.data);
    }

    public void addLast(int value) {
        IntNode last = new IntNode(value, null, null);
        last.next = sentinel;
        last.prev = sentinel.prev;

        sentinel.prev.next = last;
        sentinel.prev = last;
        size += 1;
    }

    public void removeLast() {

        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;

        size -= 1;

    }

    public void removeFirst() {
        sentinel.next.next.prev = sentinel;
        sentinel.next = sentinel.next.next;
        size -= 1;
    }

    public void size() {
        System.out.println(size);
    }

    public void getLast() {
        System.out.println(sentinel.prev.data);
    }

    public static void main(String[] args) {
        CDDList s = new CDDList(1);
        s.addFirst(10);
        s.addLast(20);
        s.addFirst(15);
        s.getFirst();
        s.getLast();
        s.removeFirst();
        s.getFirst();
        s.removeLast();
        s.getLast();
        s.size();
    }

}
