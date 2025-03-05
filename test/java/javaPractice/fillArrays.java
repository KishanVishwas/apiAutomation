package javaPractice;

import java.util.Arrays;

public class fillArrays
{
    public static void main(String[] args) {

//        fill() method fills an array with a specified value. and sorting the array
        String[] str={"apple","guava","orange","Banana"};
        Arrays.fill(str,"pears");
        Arrays.sort(str);
        for (String i : str){
            System.out.println(i);
        }
        System.out.println(Arrays.toString(str));
    }
}
