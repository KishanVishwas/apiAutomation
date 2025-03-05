package javaPractice;

import java.util.Scanner;

public class adding2NumberusingScannerClass
{
    public static void main(String[] args) {
        int x, y, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println(5);
        x=scanner.nextInt();

        System.out.println(7);
        y=scanner.nextInt();

        sum=x+y;
        System.out.println("sum is " + sum);
    }
}
