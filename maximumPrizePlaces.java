import java.util.*;

class MaximumPrize{
    public static void computeMaximumPrizePlaces(int candies){
        ArrayList<Integer> candy = new ArrayList<Integer>();
        int counter = 1;
        int prizes = 0;
        int sum = 0;
        while(sum != candies){
            sum += counter;
            if((candies - sum) > counter || (candies - sum) == 0){
                candy.add(prizes, counter);
                prizes++;
            } else {
                sum -= counter;
                
            }
            counter++;
        }

        System.out.println("The total places of prizes are " + prizes);
        System.out.print("The distribution of candies is " + candy);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of candies:");
        int candies = sc.nextInt();
        sc.close();
        computeMaximumPrizePlaces(candies);
    }
}