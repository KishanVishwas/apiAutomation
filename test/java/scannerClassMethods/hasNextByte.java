package scannerClassMethods;

import java.util.Scanner;

public class hasNextByte {
    public static void main(String[] args) {
        Scanner scanner=new Scanner("A byte is a number between -128 and 127");
        while (scanner.hasNext()){
            if (scanner.hasNextByte())
            {
                System.out.println(scanner.nextByte());
            }
            else {
                scanner.next();
            }
        }
    }
}
