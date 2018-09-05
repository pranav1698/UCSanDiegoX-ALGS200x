import java.util.*;

class AdRevenue{
    public static void computeMaximumAdRevenue(ArrayList<Float> profits, ArrayList<Float> clicks){
        float revenueMax = 0;
        while(profits.size() != 0){
            float pMax = -1000000;
            float cMax = -1000000;
            int mIndex = 0;
            int MIndex = 0;

            for(int i = 0; i < profits.size(); i++){
                if(pMax < profits.get(i)){
                    pMax = profits.get(i);
                    mIndex = i;
                }
                if(cMax < clicks.get(i)){
                    cMax = clicks.get(i);
                    MIndex = i;
                }
            }
            profits.remove(mIndex);
            clicks.remove(MIndex);
            
            if((pMax * cMax) > 0){
                revenueMax = revenueMax + (pMax * cMax);
            }
                
        }
        System.out.println("The maximum ad revenue is " + revenueMax);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of ads and number of slots:");
        int number = sc.nextInt();

        ArrayList<Float> profits = new ArrayList<Float>();
        ArrayList<Float> clicks = new ArrayList<Float>();

        for(int i = 0; i < number; i++){
            System.out.print("Enter profit of " + (i + 1) + " slot:");
            float p = sc.nextFloat();
            profits.add(i, p);
        }

        for(int i = 0; i < number; i++){
            System.out.print("Enter clicks of " + (i + 1) + " slot:");
            float c = sc.nextFloat();
            clicks.add(i, c);
        }

        computeMaximumAdRevenue(profits, clicks);
    }
}