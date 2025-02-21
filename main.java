import DsaTopics.LinkedList.LL;
import DsaTopics.LinkedList.Node;
import DsaTopics.towerOfHanoi.RecurssionReverseOrder;
import DsaTopics.towerOfHanoi.TowerOfHanoi;
import DsaTopics.trees.Tree;
import prototypedesignpattern.Student;
import threadsconcept.ABC;
import threadsconcept.threadimplement.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Thread tm=new Thread(new ABC());
        tm.start();
        tm.start();
StringBuilder s=new StringBuilder();
s.insert(0,1);
s.insert(0,2);
System.out.println(s.toString());
        System.out.println("Main Thread starts");
        Immutable ia=new Immutable(1,"2",List.of(1,2,3));
        ia.getS().add(4);
        System.out.println(ia.getS());

        Tree t=new Tree();
        TowerOfHanoi towerOfHanoi=new TowerOfHanoi();
        towerOfHanoi.towerOfHanoi(3,"S","H","D");
        RecurssionReverseOrder recurssionReverseOrder=new RecurssionReverseOrder();
        recurssionReverseOrder.reverseOrder("abc",2, new StringBuilder());
        var tree=t.buildTree(new int[]{1, 2, 3,-1,-1,8});
        List<Integer> b1=new ArrayList<>();
        t.inOrder(tree,b1);
        t.count(tree);
        System.out.println(b1);

        System.out.println(tree.value);
        LL a9=new LL();
        LL a10=new LL();
        Node n=new Node(2);
        a9.insertFirst(n);
        var res=a9.insertFirst(new Node(3));
        a9.insertLast(new Node(10));
        a10.insertLast(new Node(4));
        var res1=a10.insertLast(new Node(5));
        var sortedList=sortTwoLinkedList(res,res1);
        Node sorted=sortedList.getHead();
        while(sorted.next!=null){
            System.out.print(sorted.val);
            System.out.print("->");
            sorted=sorted.next;
        }

        Consumer<Integer> b=(num)->System.out.println(num);
        b.accept(9);
        Predicate<Integer> valj=(num)->  (9==num);
        valj.test(9);
        Supplier<Double> supp=()->{
            return 7.0+9.0;

        };
        System.out.println(supp.get());
        //        NonVegPizza nonVegPizza=new NonVegPizza();
//        ExtraCheese extraCheese=new ExtraCheese(nonVegPizza);
//        ExtraVeggi vegTopping=new ExtraVeggi(extraCheese);
//        System.out.println(vegTopping.cost());
//
//        ShapeFactory sf=new ShapeFactory();
//        var circle=sf.getShape("CIRCLE");
//        circle.draw();
//
//        GetVehicleFactory g=new GetVehicleFactory();
//        var l=g.getVehicleFactory("LUXUARY");
//        var audi= l.getVehicle("AUDI");
//        audi.average();
//
//       // TicTacToeGame ticTacToeGame=new TicTacToeGame();
//       // System.out.println(ticTacToeGame.startGame());
//
//        LoggerProcessor loggerProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
//        loggerProcessor.log(3,"The JDBC ERROR");
//
//        HashMap1<Integer,String> s=new HashMap1<>(10);
//        s.put(2,"Aaf");
//        s.put(3,"ABC");
//        s.put(4,"ABC");
//        s.put(5,"DEF");
//        s.put(2,"sub");
//        System.out.println(s.get(2));
//        Employee e=new employeeProxy();
//        e.create("Dealer");
//        e.delete("ADMIN");
//        e.modify("ADMIN");
//
//        QuickSort q=new QuickSort();
//        int[] arr=new int[]{12,11,9,5,9,89,3,0};
//        q.quickSort(arr,0,arr.length-1);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//
//
//        CompanyFactory c=new CompanyFactory();
//        var mindtree=c.getCompany("LTIMINDTREE");
//        System.out.println(mindtree.getEmployee());
//        System.out.println(mindtree.getName());
//        var tcs=c.getCompany("TCS");
//        System.out.println(tcs.getEmployee());
//        System.out.println(tcs.getName());
//
//        MultiThread m=new MultiThread();
//        Thread t=new Thread(m);
//        t.start();
//        MonitorLock monitorLock=new MonitorLock();
//        Thread t1=new Thread(()-> {
//            try {
//                monitorLock.task1();
//            } catch (InterruptedException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//        Thread t2=new Thread(()->monitorLock.task2());
//        Thread t3=new Thread(()->monitorLock.task3());
//
//        t1.start();
//
//        t2.start();
//        t3.start();


        SharedResource sharedResource=new SharedResource();
        Thread produceThread=new Thread(new ProduceTask(sharedResource));
        Thread consumeThread=new Thread(new ConsumesTask(sharedResource));//new state

//        produceThread.start();
//        consumeThread.start();//start state
//
//        ReentrantLock lock=new ReentrantLock();
//        threadsconcept.locksType.SharedResource s=new threadsconcept.locksType.SharedResource();
//        s.produce(lock);
//        threadsconcept.locksType.SharedResource s1=new threadsconcept.locksType.SharedResource();
//        s1.produce(lock);
//        Thread r1=new Thread(()->s.produce(lock));
//        Thread r2=new Thread(()->s1.produce(lock));
//
//        r1.start();
//        r2.start();
//        SharedResource1 sharedResource1=new SharedResource1(3);
//        Thread p1=new Thread(()->{
//            for(int i=0;i<9;i++){
//                try {
//                    sharedResource1.produce(i);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//
//        Thread c1=new Thread(()->{
//            for(int i=0;i<9;i++){
//                try {
//                    sharedResource1.consume();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        c1.start();
//        p1.start();
//        Thread deamonThread=new Thread(new DeamonThread());
//        deamonThread.start();
//        deamonThread.setDaemon(true);
        Student s22=new Student("abc",3,"address");
        var cloneStudent=(Student) s22.clone();

        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2),new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        for(int i=0;i<8;i++){
            var a=threadPoolExecutor.submit(()->{
                System.out.println("Task processed by: + " +Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
           ///future,callable,completeable

            ThreadPoolExecutor futrue=new ThreadPoolExecutor(1,1,1,TimeUnit.HOURS,new ArrayBlockingQueue<>(10),new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


            var f=futrue.submit(()->{
                try {
                    Thread.sleep(7000);
                    System.out.println("The sleep time finished");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            System.out.println("Is future has completed task"+ f.isDone());
            try {
                f.get(2, TimeUnit.SECONDS);
            }catch (Exception e){
                System.out.println("the task failed");
            }
            f.get();

            System.out.println("is Done="+f.isDone());
            System.out.println("is Cancelled="+f.isCancelled());

        }
        CompletableFuture<String> asyncTask=CompletableFuture.supplyAsync(()->{
            return "happy";
        });
        System.out.println(asyncTask.get());

        CompletableFuture<String> asyncTask1=CompletableFuture.supplyAsync(()->{
            return "happy";
        }).thenApplyAsync((String val)->{
            return val+"hello";
        });

        System.out.println(asyncTask.get());



        threadPoolExecutor.shutdown();

        System.out.println("Main Thread finish");
    }




    private static LL sortTwoLinkedList(Node a9, Node a10) {
        LL newNode=new LL();
        var newNode1=a9;
        var newNode2=a10;
        while(newNode1!=null && newNode2!=null){
            if(newNode1.val>newNode2.val){
                newNode.insertLast(newNode2.val);
                newNode2=newNode2.next;
            }else{
                newNode.insertLast(newNode1.val);
                newNode1=newNode1.next;
            }
        }
        while(newNode1!=null){
            newNode.insertLast(newNode1.val);
            newNode1=newNode1.next;
        }

        while(newNode2!=null){
            newNode.insertLast(newNode2.val);
            newNode2=newNode2.next;
        }
        return newNode;
    }

    static class CustomThreadFactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r) {
            Thread t= new Thread(r);
            t.setPriority(Thread.NORM_PRIORITY);
            t.setDaemon(false);
            t.setName("Aafthab");
            return t;
        }
    }
}
