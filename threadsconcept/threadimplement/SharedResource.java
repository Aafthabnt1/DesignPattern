package threadsconcept.threadimplement;

public class SharedResource {
    boolean itemAvailable=false;
    public synchronized void addItem(){
        itemAvailable=true;
        System.out.println("Item added by: "+Thread.currentThread().getName());
        notifyAll();//notify all thread who are waiting for SharedResource object to use
    }
    public synchronized  void consumeItem() throws InterruptedException {
        System.out.println("ConsumeItem method invoked by: "+Thread.currentThread().getName());
        System.out.println(itemAvailable);
        while(!itemAvailable){
            System.out.println("Thread: "+Thread.currentThread().getName()+"is waiting now");
            wait();
        }
        System.out.println("Item set to false");
        itemAvailable=false;
    }

}
