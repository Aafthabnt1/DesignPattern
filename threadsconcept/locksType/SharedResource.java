package threadsconcept.locksType;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    public void produce(ReentrantLock lock){
        lock.lock();
        System.out.println("Hi" +Thread.currentThread().getName());
        lock.unlock();

    }
}
