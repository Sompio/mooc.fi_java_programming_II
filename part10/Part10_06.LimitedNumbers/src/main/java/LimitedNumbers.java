
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            if(number < 0) {
                break;
            }
            
            numbers.add(number);
        }
        numbers.stream()
                .filter(x -> x > 0 && x <= 5)
                .forEach(s -> System.out.println(s));

    }
}
