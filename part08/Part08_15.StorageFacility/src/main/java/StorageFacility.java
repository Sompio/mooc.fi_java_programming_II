
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perre
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> container;
    
    public StorageFacility() {
        this.container = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.container.putIfAbsent(unit, new ArrayList<>());
        this.container.get(unit).add(item);
        
        //does same thing as above.
        /*if(!container.containsKey(unit)) {
            container.put(unit, new ArrayList<>());
        }
        container.get(unit).add(item);*/
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return container.getOrDefault(storageUnit, new ArrayList<>());
        
        //does same thing as above.
        /*if(!container.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return container.get(storageUnit);*/
    }

    /**
     * checks if the container contains the key storageUnit. if it does it will 
     * iterate through the arraylist until it finds the correct item and delete it.
     * to make sure to not delete multiple items we break the loop after deleting one item.
     * @param storageUnit
     * @param item 
     */
    public void remove(String storageUnit, String item) {
        if(container.containsKey(storageUnit)) {
            Iterator<String> iterator = container.get(storageUnit).iterator();
            while(iterator.hasNext()) {
                String object = iterator.next();
                if(object.equals(item)) {
                    iterator.remove();
                    break;
                }
            }
            if(container.get(storageUnit).isEmpty()) {
                container.remove(storageUnit);
            }
        }
    }
    
    /**
     * this will return an arraylist containing only the storageunits that
     * contains any items.
     * @return 
     */
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for(String key : container.keySet()) {
            if(!container.get(key).isEmpty())
                storageUnits.add(key);
        }
        return storageUnits;
    }
}
