import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        // The addLast method can be used to populate a list
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");

        System.out.println(staff);

        // The list is curently TNPG
        /**
         * The listIterator method creates a new list iterator that is positioned at the head of the list
         *  The || is used to represent the iterator position
         */

        ListIterator<String> iterator = staff.listIterator(); // |TNPG

       
          //The next method advances the iterator over the next element in the list
         iterator.next(); // T|NPG

         // the next method also returns the element that the iterator passes over
         String avenger = iterator.next(); // TN|PG
         System.out.println(avenger); // Should be "Natasha"

         // the add method inserts an element at the iterator position
         // The iterator is then positioned AFTER the element that was added
         iterator.add("Steve"); // TNS|PG
         iterator.add("Clint"); // TNSC|PG

         System.out.println(staff);

         // remove method removes the element returned by the last call to next or previous

         //iterator.remove(); // you can only remove after next or previous call, not add or remove
         // ^ causes error because it's after add method, not next or previous methods

         iterator.next(); // TNSCP|G
         iterator.remove(); // Peter is removed // TNSC|G
         System.out.println(staff);

         // set method updates the element reutrned by the last call to next or previous
        
         // set and remove methods do action on the element that they passed over
         iterator.previous(); // TNS|CG
         iterator.set("T'Challa"); // replaces Clint
        // TNS|TG
         System.out.println(staff);
        
         // hasNext method is used to determine if there is a next node after the iterator
         // often used in the condition of a while loop
         iterator = staff.listIterator(); // |TNSTG
         while(iterator.hasNext()){
            String n = iterator.next();
            if(n.equals("Natasha")){ // true when TN|STG
                iterator.remove(); // T|STG

            }
            //TSTG|
         }
         System.out.println(staff);

         // Enchanced for loops work with linked lists!
         for(String n: staff){
            System.out.println(n + " ");

         }
         // concurrent moddification exception: you can't modify a linked list while using an iterator
         // UNLESS you use the iterator to do the modifiation

         iterator = staff.listIterator(); // |TSTG
         while (iterator.hasNext()){
            String n = iterator.next();
            if (n.equals("Tony")){
                //staff.remove("Tony"); // will create concurrent modification exception

            }

         }
         // enchanced for loop AUTOMATTICALLY create an iterator
         // you CANNOT add or remove when using an enhanced for loop
         for(String n: staff){
            if(n.equals("Tony")){
                staff.add("Bruce");
            }
         }
         System.out.println(staff);
    }
}
