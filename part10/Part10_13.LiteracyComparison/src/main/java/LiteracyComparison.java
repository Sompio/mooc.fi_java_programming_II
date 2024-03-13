
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<LiteracyRate> list = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new LiteracyRate(parts[2].replace(" (%)", ""), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .sorted(Comparator.comparingDouble(LiteracyRate::getLiteracyPercent))
                    .forEach(literacyRate -> list.add(literacyRate));
                            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
      
        for(LiteracyRate lr : list) {
            System.out.println(lr.toString());
        }

    }
}
