package javaPractice;

public class getBytesMethod {
    public static void main(String[] args) {

//        getBytes() method converts a string into an array of bytes.
        String str="Hello planet earth, you are a great planet.";
        byte[] result=str.getBytes();
        System.out.println(result[1]);

//        hashCode() method returns the hash code of a string.

        System.out.println(str.hashCode()); //

        System.out.println(str.indexOf("planet"));
    }
}
