import java.util.Scanner;

public class weeklyTemperatures {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] temperatures = new int[7];

        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };


        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Enter the temperature for " + days[i] + ": ");
            temperatures[i] = input.nextInt();
        }

        // Print temperatures
        System.out.println("\nWeekly Temperatures:");

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(days[i] + ": " + temperatures[i]);
        }
    }
    
}
