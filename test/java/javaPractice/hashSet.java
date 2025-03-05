package javaPractice;

import java.util.HashMap;
import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> number=new HashSet<>();
        number.add(3);
        number.add(5);
        number.add(7);

        for (int i=0; i<=10; i++){
            if (number.contains(i)){
                System.out.println("Value is found in the I variable"+" " + i);
            }
            else {
                System.out.println("value is not found" +" " + i);
            }
        }
    }
}
