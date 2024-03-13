
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.items.add(Item);
    }

    public int totalWeight() {
        return items.stream()
                .mapToInt(Item::getWeight)
                .sum();
                
        
        
        /*int summa = 0;
        int indeksi = 0;
        while (indeksi < this.items.size()) {
        summa += this.items.get(indeksi).getWeight();
        indeksi++;
        }
        return summa;*/
    }

    public void printItems() {
        items.stream()
                .forEach(s -> System.out.println(s.toString()));
        
        /*int indeksi = 0;
        while (indeksi < this.items.size()) {
        Item t = this.items.get(indeksi);
        System.out.println(t);
        indeksi++;
        }*/
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
