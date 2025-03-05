package javaPractice;

public class constructors
{
    String model;
    String carNumber;
    String carName;
    int prodYear;
    public  constructors(String name,String reg,String carModel,int year  )
    {
        model=name;
        carNumber=reg;
        carName= carModel;
        prodYear=year;

    }
    public static void main(String[] args) {
        constructors cs=new constructors("Hyundai","KA13KN5312","creta",2024);
        System.out.println("Car Model : "+ cs.model + " Car Registration : " +cs.carNumber + "Car Model : "+ cs.carName + " Production year : " + cs.prodYear);

    }
}
