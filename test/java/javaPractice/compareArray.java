package javaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class compareArray {
    public static void main(String[] args) {

//        compare() method compares two arrays lexicographically.
        String[] str={"Volvo","Honda","Maruthi"};
        String[] str2={"Volvo","Honda","Maruthi"};

        System.out.println(Arrays.compare(str,str2));

//        equals() method checks whether two arrays are equal.

        System.out.println(Arrays.equals(str,str2));

//        sort() method sorts an array in ascending order.

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

    }
}
