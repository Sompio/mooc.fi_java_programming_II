
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peso02
 */
public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (items.containsKey(product)) {
            Item existingItem = items.get(product);
            existingItem.increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int price = 0;
        for (Item item : items.values()) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : items.values()) {
            System.out.println(item.toString());
        }
    }
}
