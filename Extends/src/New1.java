public class New1 {
    public SLList<Integer> a;

    public void print() {
        System.out.println(a.size());
    }

    public New1() {
        a = new SLList<Integer>(1);
    }

    public static void main(String[] args) {
        New1 A = new New1();
        System.out.println(A.a.size());
        A.print();
    }

}
