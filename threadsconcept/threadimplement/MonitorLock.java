package threadsconcept.threadimplement;

public class MonitorLock {
    public synchronized void task1() throws InterruptedException {
        System.out.println("Executing task 1 method which is synchronized");
        Thread.sleep(20000);
    }

    public  void task2(){
        System.out.println("Executing task 2 method ");
        synchronized (this){
            System.out.println("Executing task 2 method inside Synchronized block");
        }
    }

    public  void task3(){
        System.out.println("Executing task 3 method");
    }

}
