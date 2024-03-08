
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peso02
 */
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double maximumCapacity) {
        this.capacity = maximumCapacity;
        items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(item.weight() + getTotalWeight() <= capacity) {
            items.add(item);
        } else {
            System.out.println("Cannot add item, exceeds maximun weight");
        }
        
    }
    
    public double getTotalWeight() {
        double maxWeight = 0;
        for(Packable item : items) {
            maxWeight += item.weight();
        }
        return maxWeight;
    }

    @Override
    public double weight() {
        return getTotalWeight();
    }
    
    public String toString() {
        return "Box: " + items.size() + " items" + ", total weight " + getTotalWeight() + " kg";
    }
}
