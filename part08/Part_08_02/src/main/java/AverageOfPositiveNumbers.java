
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       /* int sum = 0;
        int count = 0;
        //int number = -1;
        double average = 0;
        
        while(true) {
            System.out.println("Enter a number or 0 to stop: ");
            int number = scanner.nextInt();
            
            if(number > 0) {
                sum += number;
                count++;
                System.out.println("Sum:" + sum + "Count: " +count);
            }
            
            if(number == 0) {
                break;
            }
        }
        
        if(count > 0 ) {
            average = (double) +1.0 * sum / count;
            System.out.println("hello average");
            System.out.println("Sum:" + sum + "Count: " +count);
            //System.out.printf("Average: %.1f%n", Math.abs(average));
            System.out.println(average);
        }
        else {
            System.out.println("Cannot calculate the average");
            //System.out.println(average);
        }*/
       
 
        int sums = 0;
        int nums = 0;
        double avg = 0;
        int nums1 = 0;
 
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            nums1 += 1;
            if (input == 0 && nums1 == 1) {
                System.out.println("Cannot calculate the average");
                break;
            }
 
            if (input > 0) {
                sums += input;
                nums += 1;
                avg = (double) sums / nums;
            }
 
            if (input == 0) {
                break;
            }
 
        }
        if (avg > 0.0) {
            System.out.println(avg);
        }
    }
}
