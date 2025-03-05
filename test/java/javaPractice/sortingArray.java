package javaPractice;

import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        String[] myArray={"volvo","BMW","Honda","Mahindra","Benz","Tata"};
        Arrays.sort(myArray);
        for (String i : myArray){
            System.out.println(i);
        }


        String[] alpha={"a","i","v","s","d"};
        Arrays.sort(alpha);
        for (String a:alpha)
        {
            System.out.println(a);
        }

        int[] b={17,25,67,5,9,657};
        Arrays.sort(b);
        for (int s: b){
            System.out.println(s);
        }
        int lowestAge=b[0];
        for (int age: b){
            if (lowestAge>age){
                lowestAge=age;
            }
        }
        System.out.println(lowestAge);

    }
}
