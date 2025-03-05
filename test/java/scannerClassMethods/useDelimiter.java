package scannerClassMethods;

import java.util.Scanner;

public class useDelimiter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner("item 1,item 2,item 3");
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        String emial="kishan";
    }
}
