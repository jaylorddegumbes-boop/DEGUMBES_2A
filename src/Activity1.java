import java.util.Scanner;

public class Activity1 {
    public void greetUser(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Birth Year: ");
        int byear = sc.nextInt();
        System.out.print("Enter Gender: ");
        String gend = sc.next();

        System.out.println("=============================");
        System.out.println("Hello, "+name+"! Welcome to Java");
        System.out.println("You were born in "+byear+" and your gender is "+gend);

    }
}