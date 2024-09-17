import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        Queue<WorkOrder> toDo = new PriorityQueue<>();
        toDo.add(new WorkOrder(1, "Play games"));
        toDo.add(new WorkOrder(3, "Go to the diddy party"));
        toDo.add(new WorkOrder(2, "Read"));
        toDo.add(new WorkOrder(2, "Rap battle Eminem"));
        

        System.out.println(toDo);
        while(toDo.size() > 0){
            System.out.println(toDo.remove()); // objects will be removed in priority order
        }
        

    }
}
