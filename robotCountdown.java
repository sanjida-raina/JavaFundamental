import java.util.Scanner;

public class robotCountdown {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = input.nextInt();

        while (true){

            if (num >= 1) {
                System.out.println(num);
                num = num - 1;
                java.util.concurrent.TimeUnit.SECONDS.sleep(5);
                

            if (num == 0){
                System.out.println("Robot launched!");
            }
            }

        }

    }
}
