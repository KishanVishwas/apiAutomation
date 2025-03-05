package javaPractice;

interface interfaceExample {
    public void AnimalSound();

    public void sleep();
}

class Animal implements interfaceExample
        {

            public void AnimalSound() {
                System.out.println("meow meow");
            }


            public void sleep() {
                System.out.println("zzzzz");
            }
        }

        class InterFaceMain{
            public static void main(String[] args) {
                Animal myAni=new Animal();
                myAni.AnimalSound();
                myAni.sleep();
            }
        }


