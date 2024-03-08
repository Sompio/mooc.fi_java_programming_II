
import java.util.Scanner;
import static jdk.internal.joptsimple.internal.Messages.message;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String message;
         
         while(true) {
             System.out.println("Enter a number or 'end' to exit: ");
             String input = scanner.nextLine();
             
             if(input.equals("end")) {
                 System.out.println("end");
                 break;
             } else {
                 int number = Integer.parseInt(input);
                 int cube = number * number * number;
                 System.out.println(cube);
             }
         }
    }
    
}
