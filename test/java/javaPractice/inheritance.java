package javaPractice;

class inheritance
{
    protected String Brand="FORD";
    public void honk()
    {
        System.out.println("dur dur tuutt ");
    }
}
class Cars extends inheritance{
    private String carModel="Mustang";

    public static void main(String[] args) {
        Cars car=new Cars();
        car.honk();
        System.out.println(car.Brand + " "+ car.carModel);

    }
}
