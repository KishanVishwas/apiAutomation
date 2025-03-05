package scannerClassMethods;

import java.util.Scanner;

public class findWithinHorizon {
    public static void main(String[] args) {

//        findWithinHorizon : method searches through a specified number of characters for the first match of a regular
//        expression provided by a Pattern object or a string. If a match is not found then it returns null.
        Scanner scanner=new Scanner("Please send an email to kishanshetty312@gmail.com for more details.");
//        Setting an pattern and horizon to start from the 0 (number of characters to search is specified by the horizon parameter,
//        if it is set to zero then it continues searching without limit.)
        String email=scanner.findWithinHorizon("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}",-1);
        if (email != null){
            System.out.println(email);
        }
        else {
            System.out.println("Email not found");
        }
        System.out.println(email);
    }
}
