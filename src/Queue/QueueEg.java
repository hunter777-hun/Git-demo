package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEg {
    public static void main(String[] args){

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Dipesh");
        queue.offer("Ramesh");
        queue.offer("Nitesh");
        queue.offer("Crystal");


        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        System.out.println(queue
        );
        System.out.println(queue.peek());
    }
}
