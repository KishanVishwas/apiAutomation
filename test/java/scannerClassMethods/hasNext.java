package scannerClassMethods;

import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        Scanner scanner=new Scanner("Please send an email to kishanshetty312@gmail.com for more details.");
        Boolean myobj=scanner.hasNext();
        while (myobj){
            System.out.println(myobj);
        }
        scanner.close();
    }
}
