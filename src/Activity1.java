import java.util.Scanner;

public class Activity1 {

    public void greetUser(Scanner sc) {

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Birth Year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter Gender: ");
        String gender = sc.next();

        System.out.println("=============================");
        System.out.println("Hello, " + name + "! Welcome to Java");
        System.out.println("You were born in " + birthYear
                + " and your gender is " + gender);
    }
}