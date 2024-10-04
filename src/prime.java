import java.util.Scanner;

public class prime {

    public static boolean primenum(int n) {
        if(n<=1){
            return false;
        }
       if(n==2){
           return true;
       }else {
           for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   return false;
               }
           }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(primenum(n)){
            System.out.println("Prime");
        }else{
            System.out.println("not");
        }

    }
}
