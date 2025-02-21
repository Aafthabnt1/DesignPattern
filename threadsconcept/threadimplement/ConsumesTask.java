package threadsconcept.threadimplement;

public class ConsumesTask implements Runnable{
    SharedResource sharedResource;

    public ConsumesTask(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {

        System.out.println("Consumer thread: "+ Thread.currentThread().getName());

        try {
            sharedResource.consumeItem();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
