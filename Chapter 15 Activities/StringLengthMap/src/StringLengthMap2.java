import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Use the Java 8 merge() method from Java 8 Note 15.1.
 */
public class StringLengthMap2
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/StringLengthMap/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Integer, Set<String>> map1 = new HashMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                // Update the map here
                // Use the Java 8 merge() method
                Set<String> p = new HashSet<>();
                p.add(word);
                map1.merge(len, p, (oldValue, notPresentValue) -> {oldValue.addAll(notPresentValue); return oldValue;});
                


            }

            ArrayList<Integer> l = new ArrayList<>();
                Set<Integer> s = map1.keySet();
                String temp = "";
                
                 
                for(int i: s){
                    l.add(i);
                }
                

                Collections.sort(l);
            // Print the strings, in increasing order of their length
            // Use this format: 1: i, a, i
            for(int i: l){
                
                for(String st:map1.get(i) ){
                    temp = temp + st +", ";
                }
                System.out.println( i + ": " + temp);
                temp = "";
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
