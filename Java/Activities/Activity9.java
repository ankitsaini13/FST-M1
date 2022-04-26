import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {
    public static void main(String args[]){

        List<String> myList=new ArrayList();
        myList.add("Anil");
        myList.add("Manoj");
        myList.add("Abhishek");
        myList.add("Pooja");
        myList.add("Deepika");

        Iterator<String> myIterator=myList.iterator();
        // print all names
        while (myIterator.hasNext()){
            String svalue= myIterator.next();
            System.out.println(svalue);
        }

        //Print 3rd Name
        System.out.println("3rd Value "+ myList.get(2));

        // Contains
        Boolean scheck;
        scheck=myList.contains("Pooja");
        System.out.println("Pooja contains in ArrayList "+ scheck);

        //Size of ArrayList
        System.out.println("Size of  ArrayList "+ myList.size());

        //Remove
        myList.remove("Pooja");
        System.out.println("Size of  ArrayList "+ myList.size());
    }
}
