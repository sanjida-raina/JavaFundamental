public class fibonacci {
    
    public static int fibonacci(int n){

   

        if (n == 1 || n == 2){
            return 1;
        }
        int f1 =  fibonacci(n-1);
        int f2 =  fibonacci(n-2);
        
        return f1 + f2;
    }

    public static void main(String[] args){


        int result = fibonacci(4);
        System.out.println(result);
    }
}
