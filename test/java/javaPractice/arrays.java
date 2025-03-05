package javaPractice;

public class arrays
{
    public static void main(String[] args) {
        int s=4;
        String[] cards={"King","Queen","Jack","Jockey"};
        //System.out.println(cards.length);
        for (int i=0; i<cards.length ;i++){
            System.out.println(cards[i]);
        }

        if (s== cards.length)
        {
            System.out.println("answer is correct");
        }
        else {
            System.out.println("retry once ");
        }

        for (String i : cards)
        {
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        int[] ages={29,23,21,25,20,18};
        //int length=ages.length;

        int lowestAge=ages[0];
        for (int age :ages)
        {
            //System.out.println(age);
            if (lowestAge > age)
            {
                lowestAge=age;
            }
        }
        System.out.println(lowestAge);

        int[][] vehicle={{2,3,4},{4,3,2}}; // row [1]={2,3,4} ,row[2]={4,3,2}

        System.out.println(vehicle[1][2]); // vehicle[1] specifies the row vehicle[2] specifies the Element



    }
}

