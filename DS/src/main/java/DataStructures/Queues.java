package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    void Queuing(){
        Queue<Integer> ages = new LinkedList<>();

        ages.add(450); //adds value to the queue
        ages.remove(450);// retrievs and removes the head of the queue - returns an exception if null is empty
        ages.peek(); // seeks top of the queue but returns null if empty
        ages.poll(); // retrievs and removes the head of the queue - returns null if empty
        ages.offer(30); //inserts new value into queue regardless of capacity size
        ages.element();//seeks top of queue but returns exception if empty


    }
}
