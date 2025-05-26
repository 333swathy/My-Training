package collectionExample;
import java.util.ArrayList;

public class ColorList {
    private ArrayList<String> colors;

    // Constructor to initialize the color list
    public ColorList() {
        colors = new ArrayList<>();
    }

    // Method to add colors to the list and print the collection
    public void addColors() {
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("Color List: " + colors);
    }

    // Method to retrieve an element at a specified index
    public void retrieveElement(int index) {
        if (index >= 0 && index < colors.size()) {
            String color = colors.get(index);
            System.out.println("Element at index " + index + ": " + color);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    // Method to iterate through all elements in the list
    public void iterateElements() {
        System.out.println("Iterating through the color list:");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    // Method to remove the third element (index 2) from the list
    public void removeThirdElement() {
        if (colors.size() > 2) {
            colors.remove(2);
            System.out.println("After removing the third element: " + colors);
        } else {
            System.out.println("Not enough elements to remove the third one.");
        }
    }

    // Method to search for an element in the list
    public void searchElement(String color) {
        if (colors.contains(color)) {
            System.out.println(color + " is found in the list.");
        } else {
            System.out.println(color + " is not found in the list.");
        }
    }

    // Main method to test all the methods
    public static void main(String[] args) {
        ColorList colorList = new ColorList();
        
        // Add colors and display the list
        colorList.addColors();

        // Retrieve the element at index 1
        colorList.retrieveElement(1);

        // Iterate through the list
        colorList.iterateElements();

        // Remove the third element and display the updated list
        colorList.removeThirdElement();

        // Search for a color in the list
        colorList.searchElement("Green");
    }


}
