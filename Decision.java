import java.util.Scanner;

public class Decision {
    public static void main(String[]args){
         Scanner input = new Scanner (System.in);
         System.out.println("Enter a distance: ");

         int distance = input.nextInt();

         if (distance < 5){
            System.out.println("Reverse");
         } else if (distance <= 10){
            System.out.println("Stop");
         } else if (distance <=20){
            System.out.println("Turn");
         } else {
            System.out.println("Forward");
         }

    }
   


    
}
