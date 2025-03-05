package javaPractice;


    enum enumExample {
        MEDIUM,
        LONG,
        HIGH

    }

    public class highEnum {
        public static void main(String[] args) {
//            enumExample eE=enumExample.LONG;

//            switch (eE){
//                case HIGH:
//                    System.out.println("high level");
//                    break;
//
//                case MEDIUM:
//                    System.out.println("Medium level");
//                    break;
//
//                case LONG:
//                    System.out.println("Long level");
//                    break;

                    for (enumExample eE:enumExample.values())
                    {
                        System.out.println(eE);
                    }
            }
        }


