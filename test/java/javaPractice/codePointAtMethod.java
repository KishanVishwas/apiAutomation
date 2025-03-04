package javaPractice;

public class codePointAtMethod {
    public static void main(String[] args) {
        String str="Hello";
        int result=str.codePointAt(2);
        System.out.println(result);

        int result1=str.codePointBefore(2);
        System.out.println(result1);

        int result2=str.codePointCount(0,4);
        System.out.println(result2);
    }
}
