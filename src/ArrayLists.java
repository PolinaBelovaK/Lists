import java.util.ArrayList;
import java.util.LinkedList;


/**
 Task for the ability to create a lists and initialize it.
 */
public class ArrayLists
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>(); //create new linked list
        ArrayList<String> arrayList = new ArrayList<>(); //create new array list

        System.out.println(String.join("", arrayList));
        System.out.println(String.join("", linkedList));
    }
}
