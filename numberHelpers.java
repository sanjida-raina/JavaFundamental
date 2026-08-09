//Problem 4A — Number Helper Methods

import java.util.Scanner;

public class numberHelpers {

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int largerOf(int first, int second){

        if (first > second){
            return first;
        } else{
            return second;
        }

    }
    public static void printLine(int length) {
            for (int i = 0; i < length; i++) {
                System.out.print("*");
            }
            System.out.println();
    }

 public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // isEven
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Is even? " + isEven(num));

        // largerOf
        System.out.print("\nEnter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("Larger number: " + largerOf(first, second));
        
        // printLine
        System.out.print("\nHow many stars? ");
        int stars = scanner.nextInt();


    }
    
}
