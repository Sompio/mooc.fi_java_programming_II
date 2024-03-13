
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(6);
        numbers.add(7);

        positiveNumbers = positive(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        System.out.println();
        for (Integer number : positiveNumbers) {
            System.out.println(number);
        }

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
    }
}
