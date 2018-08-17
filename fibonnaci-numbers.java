import java.util.Scanner;

class Fibonnaci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        
        sc.close();
        int a = 0;
        int b = 0;

        if(n == 0){
            System.out.println(0);
        } else if(n == 1) {
            System.out.println(1);
        } else if(n >= 2){
            a = 1;
            b = 0;
            for(int i = 2; i <= n; i++){
                int temp = a;
                a = a + b;
                b = temp;
            }
            System.out.println(a);
        }
    }
}