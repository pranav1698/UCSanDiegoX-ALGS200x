import java.util.*;

class MinimumWaitingTime{
    public static void computeMinimumWaitingTime(ArrayList<Integer> t){
        
        int waitingTime = 0;
        int counter = 0;

        while(t.size() != 0){
            int minTime = 100000;
            int minIndex = 0;
            for(int i =0; i < t.size(); i++){
                if(t.get(i) < minTime){
                    minTime = t.get(i);
                    minIndex = i;
                }
            }
            counter++;
            t.remove(minIndex);
            waitingTime = waitingTime + ((t.size()) * minTime);
            
        }

        System.out.println("The minimum waiting time is " + waitingTime + " minutes.");
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of patients:");
        int number = sc.nextInt();
        ArrayList<Integer> timeList = new ArrayList<Integer>();

        for(int i = 0; i <= number - 1; i++){
            System.out.print("Enter treating time for " + (i + 1) + "th patient:");
            int time = sc.nextInt();
            timeList.add(i, time); 
        }
        sc.close();
        computeMinimumWaitingTime(timeList);
    }
}