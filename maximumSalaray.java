import java.util.ArrayList;

class MaximumSalary{

    public static void computeMaximumSalary(ArrayList<Integer> numbers){
        String salary = " ";
        while(numbers.size() != 0){    
            int max = 0;
            int maxIndex = 0;
            for(int i = 0; i <= numbers.size() - 1; i++){
                if(max < numbers.get(i)){
                    max = numbers.get(i);
                    maxIndex = i;
                }
            }
            numbers.remove(maxIndex);
            salary = salary + max;
        }
        System.out.println(salary);
    }

    public static void main(String [] args){
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       numbers.add(0, 7);
       numbers.add(1, 6);
       numbers.add(2, 5);
       numbers.add(3, 9);
       numbers.add(4, 2);
       numbers.add(5, 9);
       computeMaximumSalary(numbers);
    }
}