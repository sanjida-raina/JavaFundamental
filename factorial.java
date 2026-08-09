public class factorial {
    
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        
        int recurse = factorial(n-1);
        int result = n * recurse;
        return result;

    }

    public static void main(String[] args){

        int myResult = factorial(4);
        System.out.println(myResult);
    }
}
