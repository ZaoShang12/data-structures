import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
         * the map interface is generic
         * first type given is the type of the key
         * second type given is the type of the value
         */
        Map<String, Color> favColors = new HashMap<>();

        // add elements
        favColors.put("henry", Color.BLUE);
        favColors.put("jack", Color.RED);
        favColors.put("priya", Color.GREEN);
        // two different elements with the same values
        // the same key can't have two different values!!!
        
        favColors.put("Dr. Miller", Color.GREEN);
        //Using put on a key that exists, changes the value
        favColors.put("jack", Color.MAGENTA);

        // create a set of the keys in a map
        Set<String> keys = favColors.keySet();
        for(String key: keys) {
            System.out.println(key + " (" + key.hashCode() + "): " + favColors.get(key));
        }
    }
}
