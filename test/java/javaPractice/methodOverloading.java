package javaPractice;

public class methodOverloading
{
    // method with parameters
    public static void myMethod(int age)
    {
       if(age<=18)
       {
           System.out.println("access denied for evrything");
       }
       else {
           System.out.println("everything opens to do ");
       }
    }

    public static String myMethod(String number, String name)
    {
       return("this is" + name + "'s " +number);
    }

    public static String myMethod(int wieght,double hieght)
    {
        return("wieght"+": " + wieght + " height" +": " + hieght);
    }

    public static void main(String[] args) {
        myMethod(25);
        System.out.println(myMethod("9611055312","Kishan"));
        System.out.println(myMethod(90,6.1));
    }
}
