/* Main runner method to check bag
   functionality with a selection of tests.
 */

public class Main {
    public static void main(String[] args) {
        Bag myBag = new Bag();
        myBag.add("Pen", "Pencil", "Pen", "Headphones", "Pencil",
                "Marker", "USB Drive", "Notebook", "Pen", "Marker");
        myBag.printContents();
        // contains method check after initial addition
        System.out.println("----------------------------");
        System.out.println("Does myBag contain a pen: " + myBag.contains("Pen"));
        System.out.println("Does myBag contain lunch: " + myBag.contains("Lunch"));
        System.out.println("Does myBag contain a notebook: " + myBag.contains("Notebook"));
        // count method check to cross-reference with contains
        System.out.println("----------------------------");
        System.out.println("Number of pens: " + myBag.count("Pen"));
        System.out.println("Number of lunches: " + myBag.count("Lunch"));
        System.out.println("Number of notebooks: " + myBag.count("Notebook"));
        // Remove method check with an item that is removed completely.
        System.out.println("----------------------------");
        myBag.remove("Notebook");
        // Additional check to confirm functionality if the bag does not contain that item.
        myBag.remove("Notebook");
        System.out.println("----------------------------");
        myBag.printContents();
        System.out.println("Does myBag contain a notebook: " + myBag.contains("Notebook"));
        System.out.println("Number of notebooks: " + myBag.count("Notebook"));
    }
}