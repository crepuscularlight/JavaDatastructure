import java.util.Iterator;

public class ArraySet<Type> implements Iterable<Type> {
    private Type[] items;
    private int size;
    //private ArrayList<Integer> x = new ArrayList<Integer>(10);

    public ArraySet() {
        items = (Type[]) new Object[100];
        size = 0;

    }

    public boolean contain(Type x) {
        for (int i = 0; i < size; i += 1) {
            if (items[i].equals(x)) {
                return true;
            }

        }
        return false;
    }

    public void add(Type x) {

        if (x == null) {
            throw new IllegalArgumentException("you can't add null into a set");
        }
        if (contain(x)) {
            return;
        } else {
            items[size] = x;
            size += 1;
        }
    }

    public int size() {
        return size;
    }

    //Iterable has the abstract method to create the interface iterator();
    //Iterator provides the abstract method to implement hasNext() and next();
    //overide the method Iterator<T> iterator in the Iterable interface to create iterator in the self-defined
    //type Arraysetiterator();
    public Iterator<Type> iterator() {
        return new ArraySetIterator();
    }

    private class ArraySetIterator implements Iterator<Type> {
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        public boolean hasNext() {
            return wizPos < size;

        }

        public Type next() {
            Type returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }
    }

    @Override
    public String toString() {
        StringBuilder returnSB = new StringBuilder("{");
        for (int i = 0; i < size - 1; i += 1) {
            returnSB.append(items[i].toString());
            returnSB.append(",");
        }

        returnSB.append(items[size - 1]);
        returnSB.append("}");
        return returnSB.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }

        if (other.getClass() != this.getClass()) {
            return false;
        }

        ArraySet<Type> o = (ArraySet<Type>) other;
        if (o.size() != this.size()) {
            return false;
        }
        for (Type item : this) {
            if (!o.contain(item)) {
                return false;
            }

        }
        return true;

    }


    public static void main(String[] args) {
        ArraySet<Integer> s = new ArraySet<>();
        //s.add(null);
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.contain(2));
        System.out.println(s.size());

//        Iterator<Integer> seer = s.iterator();
//        while (seer.hasNext()) {
//            System.out.println(seer.hasNext());
//        }
//
        for (int i : s) {
            System.out.println(i);
        }

        System.out.println(s);
        ArraySet<Integer> ss = new ArraySet<>();
        ss.add(1);
        ss.add(2);
        ss.add(3);

        System.out.println(ss.equals(s));
//        Set<Integer> s1 = new HashSet<>();
//        s1.add(4);
//        s1.add(5);
//        s1.add(53);
//        System.out.println(s1.contains(null));
//        Iterator<Integer> seer = s1.iterator();
//        while (seer.hasNext()) {
//            int i = seer.next();
//            System.out.println(i);
//        }
    }
}
