
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int maxAmount = 100;


        while (true) {
            System.out.print("> ");


            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            /**
             * to parse the input. input is "add 100 add 200". 
             * the +2 increment on i is needed to jump over the integers when
             * putting them in the String action.
             */
            for(int i = 0; i < parts.length; i += 2) {
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
                String action = parts[i];
                int amount = 0;
                
                if(i + 1 < parts.length) {
                    amount = Integer.parseInt(parts[i + 1]);
                }
                
                if(action.equals("add")) {
                    if(amount > 0) {
                        if(first + amount <= maxAmount) {
                            first += amount;
                        } else {
                            first = maxAmount;
                            System.out.println("First is full");
                        }
                    }
                }
                if(action.equals("move")) {
                    if(first != 0 || amount <= 0) {
                        if(first < amount) {
                            second += first;
                            first = 0;
                        } else {
                            second += amount;
                            first -= amount;
                        }
                        if(second > 100) {
                            second = 100;
                        }
                    } 
                }
                
                if(action.equals("remove")) {
                    if(second != 0) {
                        if(second - amount >= 0) {
                            second -= amount;
                        } else {
                            second = 0;
                        }
                    }
                }
            }
            
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
