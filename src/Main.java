import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===JAVA ACTIVITY PORTFOLIO===");
        System.out.println("==Name: lord");
        System.out.println("==Section/Year: BSIT 2A");
        System.out.println("=======CONTENTS=======");
        System.out.println("1. Activity 1");
        System.out.println("2. Activity 2");
        System.out.println("==============================");

        System.out.print("Enter Selection: ");
        int select = sc.nextInt();

        if (select == 1) {

            // ACTIVITY 1
            Activity1 act1 = new Activity1();
            act1.greetUser(sc);

        } else if (select == 2) {

            // ACTIVITY 2
            Activity2 act2 = new Activity2();
            act2.cinemaTicket(sc);

        } else {

            System.out.println("Selection not Found");
        }

        sc.close();
    }
}