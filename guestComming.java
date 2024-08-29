public class guestComming {
    public static int CallGuest(int n){
        
        if(n<=1){
            return 1;
        }
        //calling single guest
        int single=CallGuest(n-1);

        //calling guest in pair
        int pairGuest=(n-1)*CallGuest(n-2);

        return single+pairGuest;
    }
    public static void main(String args[]){
        int n=4;
        int result=CallGuest(n);
        System.out.println(result);
    }
    
}
