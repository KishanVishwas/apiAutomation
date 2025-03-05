package javaPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> arr=new ArrayList<>();
        arr.add(23);
        arr.add("Hello");
        arr.add('3');
        arr.add(true);
        arr.add(2,'5');
        System.out.println(arr);
        System.out.println(arr.get(3));

        ArrayList<Integer> intr=new ArrayList<>();
        intr.add(12);
        intr.add(212);
        intr.add(86);
        intr.add(98);
        Collections.sort(intr,Collections.reverseOrder());
//        Collections.sort(intr);
        for (int s : intr){
            System.out.println(s);

//            Reverse the Order

        }
    }
}
