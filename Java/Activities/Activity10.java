import java.util.HashSet;

public class Activity10 {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();

        //Add 6 objects
        hs.add("A");
        hs.add("B");
        hs.add("G");
        hs.add("H");
        hs.add("Y");
        hs.add("R");

        //Print hashlist
        System.out.println("Original HashSet "+hs);

        //Remove
        hs.remove("H");
        System.out.println("Removed H ");

        hs.remove("I");
        System.out.println("Removed I which is not present");

        //Contains
        System.out.println("Contains Value R "+hs.contains("R"));

        //Updated HashSet
        System.out.println("Updated HashSet "+hs);

    }
}
