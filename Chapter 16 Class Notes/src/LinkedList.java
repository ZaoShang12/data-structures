import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient
 * element insertion and removal. This class
 * contains a subset of the methods of the standard
 * java.util.LinkedList class.
*/
public class LinkedList
{
    private Node first; // first node. Null reference if list is empty
    static class Node{
        //node does not need access to anything in linked list
        public Node next;
        public Object data;
    }
    
    /**
        Constructs an empty linked list.
    */
    public LinkedList() {
       this.first = null;

    }



    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */
    public Object getFirst(){
        if(this.first == null){
            throw new NoSuchElementException();
        }
        return this.first.data;
    }



    /**
        Removes the first element in the linked list.
        @return the removed element
    */
    public Object removeFirst(){
        if(this.first == null){
            throw new NoSuchElementException();
        }
        Object e = this.first.data;
        this.first = this.first.next;
        return e;}




    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */
        public void addFirst(Object o){
            Node newNode = new Node();
            newNode.data = o;
            newNode.next = this.first;
            this.first = newNode;
            
        }




    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */
        public ListIterator listIterator(){
            return new LinkedListIterator();
        }




    //Class Node


    class LinkedListIterator implements ListIterator
    {
      //private data
        

        /**
            Constructs an iterator that points to the front
            of the linked list.
        */


        /**
            Moves the iterator past the next element.
            @return the traversed element
        */





        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */


        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */






        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */







        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */




    }//LinkedListIterator
}//LinkedList
