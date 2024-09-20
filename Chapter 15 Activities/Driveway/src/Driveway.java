import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        // Complete the constructor
        driveway = new Stack<>();
        street = new Stack<>();


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        if(driveway.contains(licensePlate)){
          System.out.println("This car is already in the driveway.");
        }
        else{
        driveway.push(licensePlate);
        print();
        }
    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
       
       
        while(!driveway.isEmpty() ){
          int car = driveway.pop();
          if(car == licensePlate){
            
           System.out.println("Car " + car + " has left.");
            break;
          }
          street.push(car);

        }
        
        print();
        while(!street.isEmpty()){
          driveway.push(street.pop());
        }
        print();
    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        for(int i : driveway){
          System.out.print(i+ ", ") ;
        }
        System.out.println();

        System.out.println("In Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        for(int i : street){
          System.out.print(i+ ", ") ;
        }
        System.out.println("\n------------------------------------------------------------------");

    }
}
