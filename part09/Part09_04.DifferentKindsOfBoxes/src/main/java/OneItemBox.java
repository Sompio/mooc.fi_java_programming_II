
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Next, implement the class OneItemBox, that inherits the Box class. OneItemBox
 * has the constructor public OneItemBox(), and it has the capacity of exactly
 * one item. If there is already an item in the box, it must not be switched.
 * The weight of the item added to the box is irrelevant.
 */
/**
 *
 * @author peso02
 */
public class OneItemBox extends Box {

    private int maxItem;
    private ArrayList<Item> items;

    public OneItemBox() {
        maxItem = 0;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (maxItem < 1) {
            items.add(item);
            maxItem++;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

}
