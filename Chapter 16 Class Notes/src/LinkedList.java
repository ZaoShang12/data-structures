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
        private Node position;
        private Node previous;
        private boolean isAfterNext;

        /**
            Constructs an iterator that points to the front
            of the linked list.
        */
        public LinkedListIterator(){
            position = null;
            previous = null;
            isAfterNext = false;
        }

        /**
            Moves the iterator past the next element.
            @return the traversed element
        */

        public Object next(){
            if(!hasNext() ){
                throw new NoSuchElementException();
            }

            previous = position;
            if(position == null){
                position = first;
            }
            else{
                position = position.next;

            }
            return position.data;
        }



        /**
            Tests if there is an element after the iterator position.
            @return true if there is an element after the iterator position
        */
        public boolean hasNext(){
            if(position == null){ // iterator hasnt moved
                return first != null;
            }
            return position.next != null;
        }

        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */
        public void add(Object element){
            // check if the iterator is at begining
            if(position == null){
                addFirst(element);
            }
            else{
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                // set the next element of the current position to point to our new node
                position.next = newNode;
                position= newNode;
            }
        }





        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */

       public void remove(){
        if(!isAfterNext ){
            throw new IllegalStateException();
            //c
        }
        //cehck to see if iterator is at beginning
        if(position == first){
            removeFirst();
            position = null;
        }
        else{

        }
       }
       public void set(Object element){
        if(!isAfterNext){
            throw new IllegalStateException();

        }
        position.data = element;

       }
       public String toString(){
        ListIterator iter = new listIterator();
        String total = "[";
        while(iter.hasNext()){
            total += listIterator().next() + ", ";
        }
        total += "]";
        return total;
       }



























































































        /**
            Sets the last traversed element to a different value.
            @param element the element to set
        */




    }//LinkedListIterator
}//LinkedList
