package javaPractice;

public class exceptionsTryCatch {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            throw new RuntimeException("Something went wrong");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
