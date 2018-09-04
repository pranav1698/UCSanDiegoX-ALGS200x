import java.util.*;

class MinimumSegments{

    public static void computeMinimumNumberOfGroups(ArrayList<Integer> heights, int length){
        Collections.sort(heights);
        int left = heights.get(0);
        int number = 1;

        for(int i = 0; i <= heights.size() - 1; i++){
            if((heights.get(i) - left) > length){
                left = heights.get(i);
                number++;
            }
        }

        System.out.println("The total number of segements is " + number);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int number = sc.nextInt();

        ArrayList<Integer> heights = new ArrayList<Integer>();

        for(int i = 0; i < number; i++){
            System.out.print("Enter age of student number " + (i+1) + ":");
            int age = sc.nextInt();
            heights.add(i, age);
        }

        System.out.print("Enter length of each group:");
        int length = sc.nextInt();
        

        computeMinimumNumberOfGroups(heights, length);

    }
}