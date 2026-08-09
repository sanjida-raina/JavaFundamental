import java.util.Scanner;

public class doWhile {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean okay;

        do{
            System.out.print("Enter a number: ");
            if(input.hasNextDouble()){
                okay = true;
            }else{
                okay = false;
                String word = input.next();
                System.out.println(word + " is not a number");
            }
         
        }while (!okay);
        //  double x = input.nextDouble();
    }
}