
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        /*System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);*/
        

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
                System.out.println("First: " + container1.toString());
                System.out.println("Second: " + container2.toString());
                String action = parts[i];
                int amount = 0;
                
                if(i + 1 < parts.length) {
                    amount = Integer.parseInt(parts[i + 1]);
                }
                
                if(action.equals("add")){
                    container1.add(amount);
                }
                if(action.equals("remove")) {
                    container2.remove(amount);
                }
                if(action.equals("move")) {
                    if(container1.contains() != 0 && amount > 0) {
                        if(container1.contains() < amount) {
                            int remains = amount - container1.contains();
                            container1.remove(remains);
                            container2.add(amount - remains);
                        } else {
                            container1.remove(amount);
                            container2.add(amount);
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



