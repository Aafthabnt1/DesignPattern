package producerconsumerproblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource1 {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource1(int bufferSize){
        sharedBuffer=new LinkedList<>();
        this.bufferSize=bufferSize;
    }
    public synchronized void produce(int item) throws InterruptedException {
        if(sharedBuffer.size()==bufferSize){
            System.out.println("The queue is full waiting to empty it");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced Item "+item);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        if(sharedBuffer.isEmpty()){
            System.out.println("queue is empty");
            wait();
        }
        System.out.println(sharedBuffer.poll() + " is consumed");
        notify();

    }
}
