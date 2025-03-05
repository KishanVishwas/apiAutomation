package javaPractice;

public class loops {
    public static void main(String[] args) {

//        int i=0;
//        while(i<5)
//        {
//            i++;
//            System.out.println(i);
//        }
//
//        int ie = 0;
//        do {
//            System.out.println(ie);
//            ie++;
//        }
//        while (ie < 5);
//
//        int countdown = 3;
//
//        while (countdown > 0) {
//            System.out.println(countdown);
//            countdown--;
//            System.out.println(countdown);
//        }
//
//        System.out.println("Happy New Year!!");
//
//        int dice = 1;
//
//        while (dice <= 6) {
////            if (dice < 6) { // output = No yatzy
////                System.out.println("No Yatzy.");
////            } else {
////                System.out.println("Yatzy!");
////            }
//            dice = dice + 1; // 2
//            System.out.println(dice);
//        }

        for (int ic = 0; ic <= 100; ic += 10) {
            System.out.println(ic);
        }
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        int number=2;
        for (int a =1; a<=10;a++)
        {
            if(a==4)
            {
                break;
            }
            System.out.println(number + "*" + a + " =" +number*a);

        }

    }
}
