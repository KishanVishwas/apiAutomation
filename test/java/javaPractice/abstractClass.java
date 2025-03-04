package javaPractice;

abstract class abstractClass {
    public String fname="Hello";
    public int number=5;
    public abstract void office();
}

class Employee extends abstractClass{

    public int joinedYear=2024;
    public void office(){
        System.out.println("Joined Office on "+ joinedYear);
    }

}
class Employer{
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.office();
        System.out.println(emp.joinedYear);
        System.out.println(emp.fname);
        System.out.println(emp.number);
    }
}
