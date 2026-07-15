import java.util.Scanner;

public class minutesConverter {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter total minutes: ");
        int minutes = input.nextInt();

        int hour = minutes / 60;
        int leftMinutes = minutes % 60;

        System.out.print(minutes + " minutes equals " + hour + " hours and " + leftMinutes + " minutes.");


    }

}
