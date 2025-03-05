package javaPractice;

public class copyValueOf {
    public static void main(String[] args) {

        // copyValueOf() method returns a String that represents the characters of a char array.
        char[] str={'H', 'e', 'l', 'l', 'o'};
        String str2="";
        str2=str2.copyValueOf(str,0,5);
        System.out.println(str2);
    }
}
