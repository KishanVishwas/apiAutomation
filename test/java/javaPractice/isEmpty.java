package javaPractice;

public class isEmpty {
    public static void main(String[] args) {

//        isEmpty() method checks whether a string is empty or not.
        String str="hello";
        String str2="";
        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());

//        offsetByCodePoints() method returns an index in a string which is offset from another index by a specified number of code points.
        String myStr = "Hello, World!";
        int result = myStr.offsetByCodePoints(3, 2);
        System.out.println(result);
    }
}
