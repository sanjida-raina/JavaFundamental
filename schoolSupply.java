// Day 3: Arithmetic Practice
// Problem 3A: School Supply Calculator

import java.util.Scanner;

public class schoolSupply {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Number of notebooks: ");
        int numNotebooks = input.nextInt();
        input.nextLine();

        System.out.print("Price of one notebook: ");
        double priceNotebooks = input.nextDouble();
        input.nextLine();

        System.out.print("Number of pens: ");
        int numPens = input.nextInt();
        input.nextLine();

        System.out.print("Price of one pen: ");
        double pricePen = input.nextDouble();
        input.nextLine();

        double priceN = (numNotebooks * priceNotebooks);
        double priceP = (numPens * pricePen);
        double total = (priceN + priceP);

        System.out.println("Notebook cost: $" + priceN);
        System.out.println("Pen cost: $" + priceP);
        System.out.println("Total: $" + total);
    }
}
