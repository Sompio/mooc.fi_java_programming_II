
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
public class Herd implements Movable{
    private ArrayList<Movable> herds;
    
    public Herd() {
        this.herds = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable : herds) {
            movable.move(dx, dy);
        }
    }
    
    public String toString() {
        String text = "";
        for(Movable movable : herds) {
            text += movable.toString() +"\n";
        }
        return text;
    }
    
}
