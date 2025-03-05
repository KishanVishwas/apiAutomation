package javaPractice;

public class variablesAndDatatypes
{

    public static void main(String[] arg)
    {
        int abc=90;
        double c=abc;
        float b= (float) c;
        System.out.println(b);
        char a='7';
        abc=a;
        System.out.println(abc);
        System.out.println(23324);

        String firstName="Kishan";
        String lastName="Vishwas";

        System.out.println(firstName + lastName);
        int fullName=(312);
         System.out.println(fullName + firstName + lastName);

         int x=1,y=2,z=3;
         System.out.println();


         int length=10;
         int width =21;
         int area;

        area= length*width;

        System.out.println(area);

        byte num= -127;
        float dec=num;
        long lo= (long) dec;
        System.out.println(num);

        char num1=51;
        System.out.println(num1);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

// Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);


        int myInt=27;
        double myDouble=myInt;
        System.out.println(myDouble);

        double dub=635.87;
        int iu=(int)dub;
        System.out.println(iu);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("the length of the string " + txt.length());
        System.out.println(txt.toLowerCase());
        if (txt.length()==26)
        {
            System.out.println("length is correct");
        }
        else {
            System.out.println("its wrong");
        }


        String hai="hello how are you";
        int l=hai.length();
        if (l==17)
        {
            System.out.println("answer is correct");
        }
        int s=hai.indexOf("how");
        System.out.println(s);


        String firtName = "John ";
        String latName = "Doe";
        System.out.println(firtName.concat(latName));

        double w=Math.sqrt(myInt);
        System.out.println(w);

    }
}
