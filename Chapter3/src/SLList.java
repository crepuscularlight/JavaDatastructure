public class SLList {
//    The
//    static can be:
//
//    Variable(also known as a class variable)
//
//    Method(also known as a class method)
//
//    Block
//    Nested class
    /* Static classes cannot access the outer class's instance variables or methods*/

    private static class IntNode {
        public int data;
        public IntNode next;

        public IntNode(int value, IntNode n) {
            this.data = value;
            this.next = n;
        }

    }

    public IntNode first;

    //use the private keyword to prevent other classes to use members or constructors of a class
    //hide implementation details from users
    //
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

    //    If you apply static keyword with any method, it is known as static method.
//
//    A static method belongs to the class rather than the object of a class.
//    A static method can be invoked without the need for creating an instance of a class.
//    A static method can access static data member and can change the value of it.
    public int size() {
        IntNode p = first;
        int i = 1;
        while (p.next != null) {
            p = p.next;
            i += 1;
        }
        return i;
    }

    public static void main(String[] args) {
        SLList a = new SLList(5);
        a.addFirst(10);
        a.addFirst(15);
        a.addLast(12);
        a.getFirst();
        a.getLast();
        System.out.println(a.size());
    }
}
