//Problem 3B: Average of Three Scores

import java.util.Scanner;

public class averageScores{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("First score: ");
        int first = input.nextInt();

        System.out.print("Second score: ");
        int second = input.nextInt();

        System.out.print("Third score: ");
        int third = input.nextInt();

        double average = (first + second + third) / 3;

        System.out.print("Average score: " + average);
    }
}