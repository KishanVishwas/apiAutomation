package javaPractice;

public class replaceFirst {
    public static void main(String[] args) {

//        replaceAll() method replaces the first match of a regular expression in a string with a new substring.
//        using the (?i) method to remove the related word from the string
        String str="Hello @%^$^#@^#&$ World , World , world R^&#@ 22";
        String regex="@%^$^#@^#&$";
        System.out.println(str.replaceAll(regex,"Java"));


    }
}
