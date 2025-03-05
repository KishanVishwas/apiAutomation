package javaPractice;

class polymorphism {
    public void animalSound()
    {
        System.out.println("Sounds weird");
    }
}
class Cat extends polymorphism{
     public void animalSound(){
         System.out.println("Sounds meow meow");
     }
}
class Dog extends polymorphism{
    @Override
    public void animalSound() {
        System.out.println("Sounds bow bow");
    }
}

class mainClass{
    public static void main(String[] args) {
        polymorphism myAnimal=new polymorphism();
        polymorphism myCat=new Cat();
        polymorphism myDog=new Dog();
        myDog.animalSound();
        myAnimal.animalSound();
        myCat.animalSound();
    }
}