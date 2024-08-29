import java.util.LinkedList;
import java.util.ListIterator;
/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        LinkedList<String> strings2 = new LinkedList<>(); // new reversed version of strings
        ListIterator<String> iterator = strings.listIterator(); // iterator

        // strings2 stores elements of strings in reverse order
        while(iterator.hasNext()){
            strings2.add(strings.removeLast());
           
        }
        strings.removeAll(strings); // clears all elements in strings
        iterator = strings2.listIterator(); // now points iterator to strings 2 
        while(iterator.hasNext()){
            strings.add(iterator.next()); // transfers elements and their order to the original linked list strings
           
        }
    }
}