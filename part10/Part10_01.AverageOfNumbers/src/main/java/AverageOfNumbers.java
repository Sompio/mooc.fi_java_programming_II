
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            int i = Integer.parseInt(input);
            numbers.add(i);
        }
        
        if(!numbers.isEmpty()) {
            OptionalDouble average = numbers
                    .stream().mapToInt(a -> a)
                    .average();
            System.out.println("average of the numbers: " + average);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Write your program here
        /*ArrayList<Double> inputs = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            Double number = Double.parseDouble(input);
            inputs.add(number);
            
        }
        
        if(!inputs.isEmpty()) {
            System.out.println("average of the numbers: " + calculateAverage(inputs));
        }
        

    */
    }
    
    private static double calculateAverage(ArrayList<Double> inputs) {
        return inputs.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
