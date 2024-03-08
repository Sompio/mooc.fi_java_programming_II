
import java.util.ArrayList;
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    /**
     * registry registers an owner to a licensplate using the licensplate as a
     * key. if the registry contains the key it means that the licensplate
     * already has an owner and wont add the licenseplate to the registry.
     *
     * @param licensePlate
     * @param owner
     * @return
     */
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            System.out.println("License already has an owner");
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.getOrDefault(licensePlate, null);
    }

    /**
     * checks if the registry doesnt contain the licenseplate. only removing it
     * if it exists in the registry.
     *
     * @param licensePlate
     * @return
     */
    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate)) {
            System.out.println("The car isnt in the registry.");
            return false;
        }
        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : registry.keySet()) {
            System.out.println(licensePlate.toString());
        }
    }

    /**
     * we want to know all the owners of our cars. first we loop through the
     * registry and save the owners in an arraylist. we do this because there
     * might be an owner owning multiple cars and we dont want to print the
     * owners multiple times. after that we loop through the arraylist and print
     * the owners.
     */
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : registry.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
