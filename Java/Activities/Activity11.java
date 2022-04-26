import java.util.*;

public class Activity11 {
    public static void main(String args[]){

        HashMap<Integer,String> colours=new HashMap();


        colours.put(1,"Red");
        colours.put(2,"Green");
        colours.put(3,"Yellow");
        colours.put(4,"Black");
        colours.put(5,"Purple");

        // Print the Map
        System.out.println("The Original map: " + colours);

        //Remove
        colours.remove(4);
        // Print the Map
        System.out.println("Updated: " + colours);

        // check
        System.out.println("Check Green color "+ colours.containsValue("Green") );

        //Print size

        System.out.println("Size of treeMap "+ colours.size());

    }
}
