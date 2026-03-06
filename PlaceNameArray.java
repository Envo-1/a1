import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;


public class PlaceNameArray {
    
    private ArrayList<PlaceNameEntry> data = new ArrayList<PlaceNameEntry>();
    private int comparisons;
    
    public PlaceNameArray() {
    }

    public PlaceNameArray(String filename, int size) {
        File file  = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            for(int i = 0; i < size; i++) {
                PlaceNameEntry nextPlace = new PlaceNameEntry(scanner.next());
                for(PlaceNameEntry place : data) {
                    if(nextPlace.compareTo(place.getName()) == 0) {
                        data.add(nextPlace);
                    }
                }

            }

        scanner.close(); 
        } 
        catch (Exception e) {
            System.err.println("File not found / Invalid name");
        }
            
    }

    public String search(String name) {
        comparisons = 0;
        for(PlaceNameEntry place : data) {
            comparisons++;
            if(place.compareTo(name) == 0) {
                return place.toString();
            }
        }
        return "A place by that name could not be found";
    }

    public int getComparisons() {
        return comparisons;
    }

    
}