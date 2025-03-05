package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Creta");
        cars.add("brezza");
        cars.add("Harrier");
        cars.add("xyz");

        ArrayList<String> brands=new ArrayList<String>();
        brands.add("Creta");
        brands.add("brezza");
        brands.add("Harrier");

        brands.addAll(cars);
        System.out.println(brands);

//        clear() methods -> clear() removes all items from the list.

       // cars.clear();

//        clone() method returns a copy of the ArrayList as an Object.
        ArrayList cars2 = (ArrayList)cars.clone();
        cars2.set(0, "Toyota");
        System.out.println(cars2);


//        contains() method returns true if an item exists in a list and false otherwise.

        System.out.println(brands.contains("Tata")); // True


//        ensureCapacity() method increases the capacity of a list to a specified amount, if necessary

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.ensureCapacity(20);
        for (int i=0;i<=20;i++){
            list.add(i);
            System.out.println(i);
        }
        System.out.println(list);

//        retainAll() method removes all items from a list which do not belong to a specified collection
        cars.retainAll(brands);
        System.out.println(cars);

//        lambda function
        cars.forEach((n)->{
            System.out.println(n);
        });

//
    }
}
