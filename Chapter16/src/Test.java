import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> L = new ArrayList<>(10);
//        System.out.println(L.size());
//        for (int i = 0; i < 10; i = i + 1) {
//            L.add(i);
//        }
//
//        for (int i = 0; i < L.size(); i = i + 1) {
//            System.out.println(L.get(i));
//        }
//
//        L.clear();
//        L.size();
//        System.out.println(L.isEmpty());
        LinkedList<String> S = new LinkedList<String>();
        S.add("you are a big");
        S.add("I am a hero");
        S.remove();
        for (String s : S)
            System.out.println(s);

        System.out.println(S.contains("you are a big"));

        HashSet<String> H = new HashSet<String>(5);
        H.add("I love you");
        H.add("Ma");

        S.addAll(H);

        for (String s : S)
            System.out.println(s);

        H.add("Ma");
        H.add("123");
        System.out.println("-----------");
        Iterator<String> i = H.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        TreeSet<Integer> T = new TreeSet<Integer>();
        for (int j = 0; j < 10; j += 1) {
            T.add(j);
        }

        Iterator<Integer> q = T.iterator();
        System.out.println("------------");
        while (q.hasNext()) {
            System.out.println(q.next());
        }
    }
}
