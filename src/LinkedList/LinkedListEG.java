package LinkedList;

import java.util.LinkedList;

public class LinkedListEG {
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("Dipesh");
        linkedList.push("Dip");
        linkedList.push("Dish");
        linkedList.push("pesh");
        linkedList.push("Dsh");
        //linkedList.pop();
        linkedList.add(2,"hari");
        linkedList.remove("Dsh");

        linkedList.addFirst("Dipu");
        linkedList.addLast("D");

        linkedList.removeLast();
        linkedList.removeFirst();
        System.out.println(linkedList);

        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.offer(21);
        integers.offer(23);
        integers.offer(22);
        integers.offer(29);
        integers.offer(24);

        //integers.poll();
        System.out.println(integers.indexOf(29));

        System.out.println(integers);




    }
}
