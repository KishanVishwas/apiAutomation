package javaPractice;

public class definingEvenOdd {
    public static void main(String[] args) {
        int i;
        for ( i=0;i<=10;i++) {
            if (i % 2 == 0) {
                System.out.println("number is even" + i);
            } else {
                System.out.println("nunber is odd"+ i);
            }
        }
    }
}
