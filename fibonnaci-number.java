import java.util.*;

class Fibonaci{

    public static int fibonnaci(int n){
        int[] F = new int[n + 1];

        F[0] = 0;
        try{
            F[1] = 1;
        }  catch(ArrayIndexOutOfBoundsException e){
            return F[n];
        }
            

        for(int i = 2; i <= n; i++){
            F[i] = F[i - 1] + F[i - 2];
        }

        return F[n];
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        sc.close();

        System.out.println(fibonnaci(n));
    }
}