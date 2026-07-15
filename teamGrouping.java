//Problem 4B: Team Grouping

import java.util.Scanner;
public class teamGrouping {
    public static void main(String[] args){
          Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        int teams = students / 3;
        int remaining = students % 3;

        System.out.println("Complete teams: " + teams);
        System.out.println("Students remaining: " + remaining);


    }
}
