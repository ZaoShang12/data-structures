import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	Stack<String> st = new Stack<>();
        String result = new String();
        // Complete this method. Use a Stack.
        
        while(scanner.hasNext()){
            String word = scanner.next();
            
            
            if(word.indexOf(".") == -1){
                st.push(word);
            }
            
            else{
                st.push(word.substring(0, word.length()-1));
                
                sentence = sentence.substring(sentence.indexOf(".")+1);
                String w = st.pop();
                result = result + " " + (w.substring(0,1).toUpperCase()) + w.substring(1) ;
                while(!st.isEmpty()){
                    result = result + " "+st.pop().toLowerCase();
                }
                System.out.print(".");
            }
        } 
        return result;






    }
}
