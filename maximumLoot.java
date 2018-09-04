import java.util.*;

class MaximumLoot{
    public static void computeMaximumLoot(float[] values,float[] weights,float weight){
        float[] perUnitValues = new float[values.length];
        for(int i = 0; i < values.length; i++){
            perUnitValues[i] = values[i] / weights[i];
        }

        float GainedWeight = 0;
        float maximumLoot = 0;

        while(GainedWeight != weight){
            float pUnitMax = 0; 
            int pUnitMaxIndex = 0;
            
            for(int i = 0; i < perUnitValues.length;i++){
                if((perUnitValues[i] > pUnitMax) && (perUnitValues[i] != 0)){
                    pUnitMax = perUnitValues[i];
                    pUnitMaxIndex = i;
                }
            }

            if(weights[pUnitMaxIndex] < (weight - GainedWeight)){
                GainedWeight += weights[pUnitMaxIndex];
                maximumLoot += values[pUnitMaxIndex];
            } else {
                maximumLoot += (weight - GainedWeight) * perUnitValues[pUnitMaxIndex];
                GainedWeight += (weight - GainedWeight);
            }
            perUnitValues[pUnitMaxIndex] = 0;
        }
        System.out.println("The total maximum loot is " + maximumLoot);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight of knapsack:");
        Float weight = sc.nextFloat();
        System.out.print("Enter number of items:");
        int number = sc.nextInt();

        float[] values = new float[number];
        float[] weights = new float[number];

        for(int i = 0; i < number; i++){
            System.out.print("Enter value of item number" + (i + 1) + ":");
            float value = sc.nextFloat(); 
            values[i] = value;
        
            System.out.print("Enter weight of item number" + (i + 1) + ":");
            float weit = sc.nextFloat(); 
            weights[i] = weit;
        }

        computeMaximumLoot(values, weights, weight);
    }
}