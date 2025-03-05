package javaPractice;

public class replaceAllMethod {
    public static void main(String[] args) {

//        replaceAll() method replaces the first match of a regular expression in a string with a new substring.
//        using the (?i) method to remove the related word from the string
        String str="Hello @%^$^#@^#&$ World , World , world R^&#@ 22";
        System.out.println(str.replaceAll("(?i)World",""));
        System.out.println(str.replaceAll("\\s",""));
        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("[^a-zA-Z0-9 ]",""));
    }
}
