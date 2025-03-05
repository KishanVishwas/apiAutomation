package javaPractice;

public class newClass {
    public static void main(String[] args) {
        String abc = "Hello how are you";
        int l = abc.length();
        if (l==19) {
            System.out.println("Answer is correct");
        } else if (l<19)
        {
            System.out.println("less than 19 answer is correct");
        }
        else {
            System.out.println("above are waste");
        }
    }
}
