package scannerClassMethods;

import java.io.File;
import java.util.Scanner;

public class close {
    public static void main(String[] args) {

        // Fetching the data in the text format file using scanner class and closing the scanner close after the scan of the file
        // and storing the data in the variable and printing the data
        try {
            File myObj=new File("/Users/kishanr/Downloads/sample3.txt");
            Scanner scan=new Scanner(myObj);
            while (scan.hasNextLine()){
                String data=scan.nextLine();
                System.out.println(data);
            }

            // closing the scanner after data fetching
            scan.close();
        }

        // exception will get catch block of code in the try will get not successfull
        catch (Exception e){
            System.out.println("any error occured");
            e.printStackTrace();
        }
    }
}
