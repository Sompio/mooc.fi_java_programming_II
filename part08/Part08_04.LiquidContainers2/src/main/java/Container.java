/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perre
 */
public class Container {

    int liquid;
    int maxAmount;

    public Container() {
        this.maxAmount = 100;
        this.liquid = 0;
    }

    public int contains() {
        return this.liquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (this.liquid + amount <= 100) {
                this.liquid += amount;
            } else {
                this.liquid = maxAmount;
            }
        }
    }

    public void remove(int amount) {
        if(amount > 0) {
            if(liquid - amount >= 0) {
                liquid -= amount;
            } else {
                liquid = 0;
            }
        }
    }
    

    public String toString() {
        return liquid + "/" + maxAmount;
    }
}
