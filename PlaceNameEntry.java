public class PlaceNameEntry {
    private String placename;
    private String municipality;
    private String province;
    private int population;


    // Empty Constructor
    public PlaceNameEntry() {

    }

    // Default Constructor
    public PlaceNameEntry(String placename, String municipality, String province, int population) {
        this.placename = placename;
        this.municipality = municipality;
        this.province = province;
        this.population = population;
    }

    // Copy Constructor
    public PlaceNameEntry(PlaceNameEntry other) {

    }

    // To String Override
    @Override
    public String toString() {
        return placename + ", " + municipality + ", " + province + ". Pop: " + population + ".";
    }

    // Compare to Override
    public int compareTo(String other) {
        return other.compareTo(placename);
    }
}