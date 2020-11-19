public class Dog implements Animal {
    @Override
    public void sniff(Animal a) {
        System.out.println("sniff dog");

    }

    public void flatter(Dog a) {
        System.out.println("you are cool dog");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
        a.greet(d);
        a.sniff(d);
        d.flatter(d);
        a.flatter(d);
    }
}
