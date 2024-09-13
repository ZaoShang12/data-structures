import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "Chapter 15 Activities/StringLengthMap/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Integer, String> map1 = new HashMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                // Update the map here
                if(map1.get(len) == null){
                    map1.put(len, word);
                }
                else{
                    String n = map1.get(len) + ", " + word;
                map1.put(len, n);
                }
                
                // Modify Worked Example 15.1
                
                

            }
            ArrayList<Integer> l = new ArrayList();
                Set<Integer> s = map1.keySet();
                
                 
                for(int i: s){
                    l.add(i);
                }

                Collections.sort(l);
                
               

            // Print the strings, in increasing order of their length
            // Use this format: 1: i, a, i
            for(int i: l){
                System.out.println( i + ": " + map1.get(i));
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
