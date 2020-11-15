//This is the doubly linked list
public class DLList {
    //node for the linklist
    public static class IntNode {
        int data;
        IntNode next;
        IntNode prev;

        public IntNode(int x, IntNode next, IntNode prev) {
            this.data = x;
            this.next = next;
            this.prev = prev;

        }
    }

    //member for the linklist
    public int size;
    public IntNode sentFront;
    public IntNode sentBack;

    //constructor
    public DLList() {
        sentFront = new IntNode(0, null, null);
        sentBack = new IntNode(0, null, null);
        sentFront.next = sentBack;
        sentBack.prev = sentFront;

        size = 0;
    }

    public DLList(int value) {
        IntNode first = new IntNode(value, null, null);
        sentFront = new IntNode(0, null, null);
        sentBack = new IntNode(0, null, null);

        sentFront.next = first;
        sentBack.prev = first;
        first.next = sentBack;
        first.prev = sentFront;

        size = 1;

    }

    //method
    public void addFirst(int value) {
        IntNode first = new IntNode(value, null, null);

        first.prev = sentFront;
        first.next = sentFront.next;
        sentFront.next.prev = first;
        sentFront.next = first;

        size += 1;

    }

    public void getFirst() {
        System.out.println(sentFront.next.data);
    }

    public void addLast(int value) {
        IntNode last = new IntNode(value, null, null);

        last.next = sentBack;
        last.prev = sentBack.prev;
        sentBack.prev.next = last;
        sentBack.prev = last;

        size += 1;
    }

    public void getLast() {
        System.out.println(sentBack.prev.data);
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        DLList dl = new DLList();

        dl.addFirst(1);
        dl.addLast(2);
        dl.addFirst(10);
        dl.addFirst(100);

        dl.getFirst();
        dl.getLast();

        System.out.println(dl.size());
    }


}
