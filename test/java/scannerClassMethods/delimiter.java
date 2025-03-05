package scannerClassMethods;

import org.apache.xmlbeans.impl.xb.xsdschema.PatternDocument;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class delimiter {
    public static void main(String[] args) {
        Scanner scan=new Scanner("the code is able to scan");
        System.out.println(scan.delimiter());
        scan.close();

        Pattern pattern=Pattern.compile(String.valueOf(scan.delimiter()));
        Matcher matcher=pattern.matcher("the code is able to scan");
        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("No match found.");
        }

    }
}

