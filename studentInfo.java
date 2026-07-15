//Day 2: Keyboard Input
// Problem 2: Student Information Card

import java.util.Scanner;

public class studentInfo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your grade: ");
        int grade = input.nextInt();
       input.nextLine();
        System.out.print("Enter your favorite subject: ");
        String subject = input.nextLine();
        System.out.print("Enter your favorite activity: ");
        String activity = input.nextLine();

        System.out.println("--------------------------");
        System.out.println("STUDENT INFORMATION");
        System.out.println("--------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Favorite Subject: " + subject);
        System.out.println("Favorite Activity: " + activity);
        System.out.println("--------------------------");




    }

}