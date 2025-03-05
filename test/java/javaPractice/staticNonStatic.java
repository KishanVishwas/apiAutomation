package javaPractice;

public class staticNonStatic
{
    static void StaticMethod(){
        String str="hello world ";
        System.out.println(str);
    }

    public void NonStaticMethod(){
        int a=54;
        System.out.println(a);
    }

    public static void main(String[] args) {
        StaticMethod();

        staticNonStatic nsm=new staticNonStatic();
        nsm.NonStaticMethod();

    }
}
