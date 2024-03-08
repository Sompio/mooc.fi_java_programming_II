
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Implement the class BoxWithMaxWeight, that inherits the Box class.
 * BoxWithMaxWeight has a constructor public BoxWithMaxWeight(int capacity),
 * that defines the max weight allowed for that box. You can add an item to a
 * BoxWithMaxWeight when and only when, adding the item won't cause the boxes
 * maximum weight capacity to be exceeded.
 */
/**
 *
 * @author peso02
 */
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        items = new ArrayList<>();
        this.capacity = capacity;
    }

    private int getTotalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    @Override
    public void add(Item item) {
        if (getTotalWeight() + item.getWeight() <= capacity) {
            items.add(item);
        } else {
            System.out.println("Cannot add item, exceeds maximum weight");
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

}
