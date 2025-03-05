package javaPractice;

public class exceptionThrows {
    static void CheckAge(int age)
    {
        if (age<18){
            throw new ArithmeticException("Access denied to enter the Phone number and login");
        }
        else{
            System.out.println("Aceess granted for login and entry ");
        }
    }
    public static void main(String[] args) {

       CheckAge(15);
    }
}
