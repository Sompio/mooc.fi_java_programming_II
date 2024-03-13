
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            inputs.add(input);
            
        }
        /*String lines = inputs.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");
        System.out.println(lines);*/
        
        inputs.stream()
                .forEach(s -> System.out.println(s));
                

    }
}
