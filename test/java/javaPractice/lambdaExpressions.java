package javaPractice;

import java.util.ArrayList;

public class lambdaExpressions {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x++*++x);

//        forEach() method performs an action on every item in a list. The action can be
//        defined by a lambda expression that is compatible with the accept() method of Java's Consumer interface

        ArrayList<Integer> car=new ArrayList<Integer>();
        car.add(8);
        car.add(7);
        car.add(9);
        car.add(10);
        System.out.println(car);
        car.forEach((n)->{
            System.out.println(n);
        });
    }
}
