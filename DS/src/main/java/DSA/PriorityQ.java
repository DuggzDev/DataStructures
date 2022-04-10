package DSA;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
    void PQ(){
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        que.add(30);
        que.add(10);
        que.add(15);
        que.add(5);


     que.forEach(System.out::println);

     //Same as a que but it's in order with highest priority first.
    }
}
