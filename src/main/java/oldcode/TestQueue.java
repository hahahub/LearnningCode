import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TestQueue {
    public static void printQueue(Queue queue){
       while (queue.peek() != null) {
            System.out.println(queue.remove() + " ");
        }
        System.out.println("-------");
    }

    public static void  main(String[] args){
        Queue<Integer>queue = new LinkedList<Integer>();
        Random random = new Random(47);
        for (int i =0;i < 10;i++)
            queue.offer(random.nextInt(i +10));
        printQueue(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for (Character c : "asdasdasd".toCharArray())
            qc.offer(c);
        printQueue(qc);
    }
}