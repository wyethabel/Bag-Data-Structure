/* Bag type data structure built around a HashMap,
   where keys are item names and values represent
   the number of that item in the bag.
*/

import java.util.*;

public class Bag {
    private HashMap<String, Integer> contents;

    public Bag() {
        this.contents = new HashMap<>();
    }

    // Allows for the insertion of multiple items by name using variable arguments.
    public void add(String... items) {
        for (String i : items) {
            this.contents.put(i, this.contents.getOrDefault(i, 0) + 1);
        }
    }

    // Allows for the removal of an item by name.
    public void remove(String item) {
        if (!contents.containsKey(item)) {
            System.out.println("The bag does not contain this item.");
            return;
        }
        contents.computeIfPresent(item, (key, value) -> (value > 1) ? value - 1 : null);
    }

    // Prints the entire contents of the bag.
    // Not a required method per task instructions but added to support testing.
    public void printContents() {
        System.out.println(contents);
    }

    // Checks if a specific item is contained in the bag.
    public boolean contains(String item) {
        return contents.containsKey(item);
    }

    // Provides the number of times an item appears in the bag.
    public int count(String item) {
        return contents.getOrDefault(item, 0);
    }
}
