package javaPractice;

public class ifElseifElse
{
    public static void main(String args[]) {
        String abc = "Hello how are you";
        int l = abc.length();
        if (l==19) {
            System.out.println("Answer is correct");
        } else if (l<19)
        {
            System.out.println("less than 19 answer is correct");
        }
        else {
            System.out.println("above are waste");
        }

        int time = 20;
        String result =
                (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }

}

