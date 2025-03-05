package javaPractice;

public class stringToArray {
    public static void main(String[] args) {
        String str="hello world";
        char[] myArray = str.toCharArray();
        for (char i : myArray)
        {
            System.out.println(i);
        }
    }
}
