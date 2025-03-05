package scannerClassMethods;

import java.util.Scanner;

public class findInLineMethod {
    public static void main(String[] args) {
        // Create a scanner object and string value having a email in that
        Scanner scanner=new Scanner("Please send an email to kishanshetty312@gmail.com for more details.");

//        Get the email address with a pattern
        String email=scanner.findInLine("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

//        finding the email in the string using if else

        if (email != null)
        {
            System.out.println(email);
        }
        else {
            System.out.println("Email not found");
        }
        scanner.close();
    }
}
