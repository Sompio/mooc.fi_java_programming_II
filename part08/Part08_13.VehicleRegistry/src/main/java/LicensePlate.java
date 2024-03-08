
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        String numericString = "";
        int numbers = 1;
        //System.out.println(liNumber + "Linumber");
        for(char c : liNumber.toCharArray()) {
           // System.out.println(c + " char");
            if(Character.isDigit(c)) {
                numericString += c;
            } else if(liNumber.isEmpty()) {
                //System.out.println("Break");
                break;
            }
        }
        if(!numericString.isEmpty()) {
            numbers = Integer.parseInt(numericString);
            //System.out.println(numbers + " numbers");
        }
        
        result = prime * result * numbers;
        //System.out.println(result);
        return result;
       
    }
    
    @Override
    public boolean equals(Object object) {
        if(object.getClass() != this.getClass() || object == null) {
            return false;
        } else {
            LicensePlate otherLicensePlate = (LicensePlate) object;
            
            return otherLicensePlate.country == this.country &&
                    otherLicensePlate.liNumber == this.liNumber;
        }
    }

}
