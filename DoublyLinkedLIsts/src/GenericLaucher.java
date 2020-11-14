public class GenericLaucher {
    public static void main(String[] args) {
        GenericTest<Integer> s = new GenericTest<>(5);
        System.out.println(s.value);
        s.print();
    }

}
