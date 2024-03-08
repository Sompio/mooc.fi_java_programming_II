
import java.util.Scanner;

public class Main {
    public TodoList list;
    public UserInterface ui;
    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        //String task = scanner.nextLine();
        
        /*list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        
        list.remove(2);
        list.print();
        
        list.add("buy raisins");
        list.print();
        
        list.remove(1);
        list.remove(1);
        list.print();*/

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

    }
}
