public class PlaceNameEntry {
    private int id;
    private String placename;
    private String municipality;
    private String province;
    private int population;


    // Empty Constructor
    public PlaceNameEntry() {

    }

    // Default Constructor
    public PlaceNameEntry(int id, String placename, String municipality, String province, int population) {
        this.id = id;
        this.placename = placename;
        this.municipality = municipality;
        this.province = province;
        this.population = population;
    }

    // Copy Constructor
    public PlaceNameEntry(PlaceNameEntry other) {

    }

    // Constructor from string
    public PlaceNameEntry(String string) {
        String[] tempArray = string.split(",");
        this.id = Integer.parseInt(tempArray[0]);
        this.placename = tempArray[1];
        this.municipality = tempArray[2];
        this.province = tempArray[3];
        this.population = Integer.parseInt(tempArray[4]);
        }

    public String getName() {
        return this.placename;
    }

    // To String Override
    @Override   
    public String toString() {
        return id + "," + placename + "," + municipality + "," + province + "," + population;
    }

    // Compare to Override
    public int compareTo(String other) {
        return other.compareTo(placename);
    }
}