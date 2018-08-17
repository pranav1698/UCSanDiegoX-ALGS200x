import java.util.Scanner;

class GCD{

    public static int calculateGCD(int a, int b){
        int dividend = 0;
        int divisor = 0;
        
        if(a > b){
            dividend = a;
            divisor = b;
        } else {
            dividend = b;
            divisor = a;
        }

        while(divisor != 0){
            int temp = divisor;
            divisor = dividend % divisor;
            dividend = temp;
        }

        return dividend;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println(calculateGCD(a, b));
    }
    
}