package threadsconcept.deamonthread;

public class DeamonThread implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
