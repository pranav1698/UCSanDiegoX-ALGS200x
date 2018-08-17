import java.util.*;

class Last{
    public static int getLastNumber(int n){
        if(n <= 1){
            return n;
        }

        int current = 1;
        int previous = 0;
        for(int i = 2; i <= n; i++){
            int tempPrevious = current;
            current = current + previous;
            previous = tempPrevious;
        }

        return current % 10;
           
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println(getLastNumber(n));
    }
}