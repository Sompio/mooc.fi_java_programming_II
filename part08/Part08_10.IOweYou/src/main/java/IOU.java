
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author perre
 */
public class IOU {
    private HashMap<String, Double> iouMap;
    
    public IOU() {
        iouMap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        iouMap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        for(String key : iouMap.keySet()) {
            if(key.contains(toWhom)) {
                System.out.println(iouMap.get(key));
                return iouMap.get(key);
            }
        }
        System.out.println("Could not find any debts to that person");
        return 0;
    }
}

