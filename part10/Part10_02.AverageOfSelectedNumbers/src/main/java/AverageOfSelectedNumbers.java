
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            
            int number = Integer.parseInt(input);
            numbers.add(number);

        }
                    
            if(!numbers.isEmpty()) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String input = scanner.nextLine();
                
                if(input.equals("p")) {
                    OptionalDouble average = numbers
                            .stream()
                            .mapToInt(x -> x)
                            .filter(x -> x > 0)
                            .average();
                    System.out.println("Average of the positive numbers: " + average);
                }
                if(input.equals("n")) {
                    OptionalDouble average = numbers
                            .stream()
                            .mapToInt(x -> x)
                            .filter(x -> x < 0)
                            .average();
                    System.out.println("Average of the negative numbers: " + average);
                }
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*

        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> input = new ArrayList<>();

        while (true) {
            String read = scanner.nextLine();

            if (read.equals("end")) {
                break;
            }

            input.add(Integer.valueOf(read));
        }

        System.out.println("");

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choise = scanner.nextLine();
        if (choise.equals("n")) {
            System.out.println("Average of the negative numbers: " + input.stream().filter(l -> l < 0).mapToInt(i -> i).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: " + input.stream().filter(l -> l > 0).mapToInt(i -> i).average().getAsDouble());
        }
    }*/

    /*Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<String> values = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            values.add(input);
        }
        System.out.println("Print the average of the negative numbers or the "
                + "positive numbers? (n/p)");
        String sign = scanner.nextLine();
        double average = 0.0;

        if (sign.equals("n")) {
            average = values.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else {
            average = values.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
    /*Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            double number = Double.parseDouble(input);
            numbers.add(number);
            
        }

        if(!numbers.isEmpty()) {
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String choice = scanner.nextLine();
            switch(choice) {
                case "n" : 
                    double averageNegative = calculateAverage(numbers.stream().filter(n -> n < 0));
                    System.out.println("Average of the negative numbers: " + averageNegative);
                    break;
                case "p" :
                    double averagePositive = calculateAverage(numbers.stream().filter(n -> n > 0));
                    System.out.println("Average of positive numbers: " + averagePositive);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }*/
    }

    private static double calculateAverage(java.util.stream.Stream<Double> numbers) {
        return numbers.mapToDouble(Double::doubleValue).average().orElse(0);
    }
}
