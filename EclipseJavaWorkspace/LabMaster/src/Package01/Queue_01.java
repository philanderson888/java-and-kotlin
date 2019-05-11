package Package01;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;

public class Queue_01 {
    public static void main(String[] args) {


        var queue01 = new ArrayBlockingQueue<Integer>(3);  // max number of items

        try{
            queue01.add(10);
            queue01.add(30);
            queue01.add(60);
            queue01.add(50);
            queue01.offer(70);  // returns null if too many
            queue01.poll();  // if no items will not fail
        }
        catch(IllegalStateException e){
            System.out.println("too many items");
        }

        System.out.println("\n\nQueue 01");
        System.out.println(queue01);

        System.out.println("\n\nQueue 02");
        var queue02 = new LinkedList<Integer>();
        queue02.add(10);
        queue02.add(30);
        queue02.add(60);
        queue02.add(50);

        System.out.println(queue02);

        System.out.printf("\nFirst item in queue is %d",queue02.element());

        System.out.printf("\nRemoving item %d means queue now looks like %s", queue02.remove(),queue02);
        System.out.printf("\nRemoving item %d means queue now looks like %s", queue02.remove(),queue02);
        System.out.printf("\nRemoving item %d means queue now looks like %s", queue02.remove(),queue02);
        System.out.printf("\nRemoving item %d means queue now looks like %s", queue02.remove(),queue02);


    }
}
