package threadsconcept.threadimplement;

public class ProduceTask implements Runnable{
    SharedResource sharedResource;
    int bufferSize=6;
    int size=0;
    public ProduceTask(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        System.out.println("Producer thread: "+ Thread.currentThread().getName());
        try{
            for(int i=0;i<6;i++){
                sharedResource.addItem();
                size++;
                if(size==bufferSize){
                    wait();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedResource.addItem();
    }
}
