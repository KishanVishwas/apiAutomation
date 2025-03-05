package javaPractice;

public class trimMethod {
    public static void main(String[] args) {

//        Using the Trim method to remove the unwanted spaces in the prefix and suffix of the sentence
        String str="    Hello World     ";
        System.out.println(str);
        System.out.println(str.trim());
        String str2=str.trim();

//Reverse the string using the StringBuilder methods and removed the spaces using the replaceAll method using \\s metaCharacters
        String reverse= new StringBuilder(str2).reverse().toString();
        String reverse2=reverse.replaceAll("\\s","");
        System.out.println(reverse2);
    }
}
