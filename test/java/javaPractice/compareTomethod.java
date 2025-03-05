package javaPractice;

public class compareTomethod {
    public static void main(String[] args) {
        String str="Hello";
        String str2="Hello";
        System.out.println(str.compareTo(str2));

        System.out.println(str.compareToIgnoreCase(str2));


//        conCat() method concatenate a string to the end of another string.
        String firstName="Kishan";
        String lastName="Vishwas";
        System.out.println(firstName.concat(lastName));

//        contains() will the response as boolean value , if the query met with success case

        System.out.println(firstName.contains("Kis")); // true
        System.out.println(firstName.contains("hel")); // false

//        contentEquals() method Find out if a string contains a sequence of characters:

        System.out.println(firstName.contentEquals("Kishan")); // true

    }
}
