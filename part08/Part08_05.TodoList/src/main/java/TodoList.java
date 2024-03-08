
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peso02
 */
public class TodoList {
    private List<String> list;
    
    public TodoList() {
        list = new ArrayList<String>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void remove(int number) {
        list.remove(list.get(number -1));
    }
    
    public void print() {
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+ ": " + list.get(i));
        }
        
        /*for(String listItem : list) {
            System.out.println(listItem);
        }*/
    }
}
