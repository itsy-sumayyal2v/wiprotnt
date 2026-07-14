import java.util.TreeSet;
import java.util.Iterator;

class Country {
    TreeSet<String> T1 = new TreeSet<>();

    // Method to save country names
    public TreeSet<String> saveCountryNames(String countryName) {
        T1.add(countryName);
        return T1;
    }

    // Method to get a country
    public String getCountry(String countryName) {
        Iterator<String> it = T1.iterator();

        while (it.hasNext()) {
            String country = it.next();
            if (country.equals(countryName)) {
                return country;
            }
        }
        return null;
    }
}

public class CountryTreeSet {
    public static void main(String[] args) {

        Country obj = new Country();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries in TreeSet:");
        System.out.println(obj.T1);

        String result = obj.getCountry("India");

        if (result != null)
            System.out.println("Country Found: " + result);
        else
            System.out.println("Country Not Found");
    }
}