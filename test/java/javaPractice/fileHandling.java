package javaPractice;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) {
       try {
           File file=new File("fileName.txt");
           if (file.createNewFile()){
               System.out.println("File Created : " + file.getName());
           }
           else {
               System.out.println("File already exists");
           }
       }
       catch (IOException e){
           System.out.println("an error occured");
           e.printStackTrace();
       }


    }
}
