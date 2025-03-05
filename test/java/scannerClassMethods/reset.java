package scannerClassMethods;

import java.util.Locale;
import java.util.Scanner;

public class reset {
    public static void main(String[] args) {
        Scanner myObj = new Scanner("A string to scan");

// Change configuration
        myObj.useDelimiter(",");
        myObj.useLocale(new Locale("es"));
        myObj.useRadix(16);

// Reset the configuration
        myObj.reset();

// Read configuration values
        System.out.println(myObj.delimiter());
        System.out.println(myObj.locale());
        System.out.println(myObj.radix());
    }
}
