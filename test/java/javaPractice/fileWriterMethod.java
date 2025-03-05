package javaPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class fileWriterMethod {
    public static void main(String[] args)  {
        try {

            String[] fileDetails={"Files in Java might be tricky, but it is fun enough!","Files in Java might be not be tricky , but it is fun enough!"};
            String str=fileDetails.toString();
//            for (String str:fileDetails){
//                System.out.println(str);
//            }
            FileWriter file=new FileWriter("/Users/kishanr/Downloads/sample3.txt");
           // file.write(String.join("\n",str));
            file.write(str);
            file.close();
            System.out.println("wrote the above lines successfully ");
        }
        catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }


    }
}
