package javaPractice;

interface interfaceExample2
{
    public void firstInterface();
}

interface interfaceExample3{
    public void secondInterface();
}

class Example implements interfaceExample2 ,interfaceExample3{

    public void firstInterface() {
        System.out.println("Interface example ");
    }


    public void secondInterface() {
        System.out.println("interface example 2");
    }
}

class Main2{
    public static void main(String[] args) {
        Example int2=new Example();
        int2.firstInterface();
        int2.secondInterface();
    }
}