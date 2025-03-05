package javaPractice;

import static java.lang.Integer.sum;

public class recursion
{
    public static void main(String[] args) {
        int result=sum(5);
        System.out.println(result);
    }

    private static int sum(int k) {
        if (k>0){
            return k + sum(k-1);
        }
        else {
            return 0;
        }
    }
}
