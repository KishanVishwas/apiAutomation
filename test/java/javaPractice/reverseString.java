package javaPractice;

public class reverseString {
    public static void main(String[] args) {
        String str="Hello how are you";
        String reverse=new StringBuilder(str).reverse().toString(); // Using stringBuilder method to reverse the string
        System.out.println(reverse);


        String reversed="";
        for (int i=str.length()-1;i>=0;i--) // using the manual method to get the string reversed
        {
            reversed +=str.charAt(i);

        }
        System.out.println(reversed);
    }
}
