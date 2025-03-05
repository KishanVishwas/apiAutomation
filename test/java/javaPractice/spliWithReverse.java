package javaPractice;

import java.util.Arrays;

public class spliWithReverse {
    public static void main(String[] args) {
        String str="Madam, in Eden, I'm Adam.";
        String[] reverse=str.split("\\s");
        String str2=new StringBuilder(Arrays.toString(reverse)).reverse().toString();
        System.out.println(str2);
    }
}
