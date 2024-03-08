
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Next implement the class MisplacingBox, that inherits the Box-class.
 * MisplacingBox has a constructor public MisplacingBox(). You can add any items
 * to a misplacing box, but items can never be found when looked for. In other
 * words adding to the box must always succeed, but calling the method isInBox
 * must always return false.
 */
/**
 *
 * @author peso02
 */
public class MisplacingBox extends Box {

    private ArrayList<Item> items;

    public MisplacingBox() {
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }

}
