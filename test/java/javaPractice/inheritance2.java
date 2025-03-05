package javaPractice;

public class inheritance2 extends inheritance{
    protected String bikeName="XL super";
    public static void main(String[] args) {
        inheritance2 inh=new inheritance2();
        inh.honk();
        System.out.println(inh.Brand + " " +inh.bikeName);
    }
}
