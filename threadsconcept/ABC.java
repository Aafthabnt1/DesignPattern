package threadsconcept;

public class ABC implements Runnable{
    @Override
    public void run() {
        System.out.println("ABC run");
    }
}
