// James Cooper
// CS272 - M01
// Lab8
// October 18, 2021

public class QueueTest {
    public static void main(String args[]) {
        
        // testing linked queue
        System.out.println("LinkedQueue:");
        LinkedQueue<Integer> lq = new LinkedQueue<Integer>();
        lq.enqueue(10);
        lq.enqueue(20);
        lq.enqueue(30);
        System.out.println(lq.isEmpty());
        System.out.println(lq.size());
        System.out.println(lq.front());
        lq.dequeue();
        System.out.println(lq.size());
        System.out.println(lq.front());
        lq.dequeue();
        System.out.println(lq.size());
        System.out.println(lq.front());
        lq.dequeue();
        System.out.println(lq.size());
        System.out.println(lq.isEmpty());
    }
}
