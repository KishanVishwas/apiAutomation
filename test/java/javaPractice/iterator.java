package javaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        HashSet<String> ne=new HashSet<>();
        ne.add("Hello");
        ne.add("world");
        ne.add("java");

        Iterator<String>ye=ne.iterator();
        System.out.println(ye.equals("Hello"));
        System.out.println(ye.next());
        System.out.println(ye.next());

    }
}
