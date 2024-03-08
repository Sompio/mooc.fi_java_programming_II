
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peso02
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        boolean start = true;
        while(start) {
            System.out.println("commands: stop, add, remove, print");
            String answer = scanner.nextLine();
            String task;
            switch(answer) {
                case "stop":
                    System.out.println("Command: stop");
                    start = false;
                    break;
                case "add":
                    System.out.println("To add: ");
                    task = scanner.nextLine();
                    todoList.add(task);
                    break;
                case "list":
                    System.out.println("Command: ");
                    todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    task = scanner.nextLine();
                    todoList.remove(Integer.valueOf(task));
                    break;
            }
        }
    }
    
}
