public interface Animal {
    default public void greet(Animal a) {
        System.out.println("hello animal");
    }

    default public void sniff(Animal a) {
        System.out.println("sniff animal");
    }

    default public void flatter(Animal a) {
        System.out.println("you are cool animal");
    }
}
