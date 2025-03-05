package javaPractice;

class OuterClass{
    int x=13;

    class InnerClass{
         int y=24;
    }
}
class main{
    public static void main(String[] args) {
        OuterClass myOuter=new OuterClass();
        OuterClass.InnerClass myInner=myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
    }
}
