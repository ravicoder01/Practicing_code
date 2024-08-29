public class factorial_recursion {
    public static int fact(int n){
         if(n==0 || n==1){
            return 1;
         }
         int fact_nm1= fact(n-1);
         int factorial=n*fact_nm1;
         return factorial;

    }
    public static void main(String args[]){
        int n=5;
        int result=fact(n);
         System.out.println("Factorial of "+ n +" is: "+ result);
    }
}
