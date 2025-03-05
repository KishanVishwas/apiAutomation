package javaPractice;

public class classAttributes
{
    int b=25;

    public static void main(String[] args) {
        classAttributes obj=new classAttributes();
        System.out.println(obj.b);;
        obj.b=56;
        System.out.println(obj.b);
    }
}
