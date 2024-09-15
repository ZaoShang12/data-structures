import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter. Then print out the word sets in
 * alphabetical order. Update the map by modifying
 * Worked Example 15.1.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/FirstLetterMap/FirstLetterMap2/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Character, Set> map = new HashMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Character c = word.charAt(0);

                // Update the map here
                // Modify Worked Example 15.1
                if(map.get(c) == null){
                    Set<String> tempSet = new HashSet<>();
                    tempSet.add(word);
                    map.put(c, tempSet);
                }
                else{
                    Set<String> tempSet = map.get(c);
                    tempSet.add(word);
                map.put(c, tempSet);
                }


            }
            
            ArrayList<Character> l = new ArrayList<>();
            Set<Character> s = map.keySet();
                
                 
                for(char i: s){
                    l.add(i);
                }

                Collections.sort(l);
            // Print the map here in this form
            // a: [a, able, aardvark]
            for(Character i: l){
                System.out.println( i + ": " + map.get(i));
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
