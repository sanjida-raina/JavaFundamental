//Problem 2A: Sum from 1 to N

import java.util.Scanner;

public class SumToNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++){

            sum = sum + i;
        }

        System.out.print("Sum: "+ sum);
    }
}