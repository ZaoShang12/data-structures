import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        // Your work goes here
        HashSet<Integer> numSet = new HashSet<Integer>();
        for(int i = 2; i<=n;i++){
            numSet.add(i);
        }

    
        for(int i = 2; i<n;i++){
            
            for(int j = 2; j <n; j++){
                if(numSet.contains(j) && j != i && j % i == 0){
                    numSet.remove(j);
                }
            }
        }
        System.out.println(numSet);







    }
}
