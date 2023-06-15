package Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEG {

    public static void main(String[] args){

        Queue<Double> queue = new LinkedList<Double>();

        queue.offer(2.5);
        queue.offer(3.5);
        queue.offer(1.5);
        queue.offer(4.0);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println();
        Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.offer(1.4);
        queue1.offer(3.4);
        queue1.offer(2.4);
        queue1.offer(4.0);

        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }


    }
}
