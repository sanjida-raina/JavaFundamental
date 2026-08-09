import java.util.Scanner;
import java.util.ArrayList;


public class roboticsMembers {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<String> members = new ArrayList<>();

        System.out.println("Enter member names. Press Enter without a name to stop.");

        while (true){

            System.out.print("Name: ");
            String name = input.nextLine();

        if (name.equals("")){
            break;

        } else{
            members.add(name);

        }

        }

        System.out.println(members);


        System.out.println("\nTEAM MEMBERS");

        for (int i = 0; i < members.size(); i++){

            System.out.println((i + 1) + ". " + members.get(i));
        }

        String longest = members.get(0);

        for (int i = 1; i < members.size(); i++) {
            if (members.get(i).length() > longest.length()) {
                longest = members.get(i);
            }
        }

        System.out.println("Longest name: " + longest);

    }
    
}
