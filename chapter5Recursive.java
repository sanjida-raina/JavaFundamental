public class chapter5Recursive{

    int n = 5;
    public static void countdown(int n){

        if (n==0){
            System.out.println("Blastoff!");
        }else{
            System.out.println(n);
            countdown(n-1);
        }
    }
}