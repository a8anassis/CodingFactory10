package gr.aueb.cf.ch16.threads;

public class Main {

    public static void main(String[] args) {
        Runnable worker1 = new WorkerThread();
        Runnable worker2 = new WorkerThread();
        WorkerThread worker3 = new WorkerThread();
        WorkerThread worker4 = new WorkerThread();
        WorkerThread worker5 = new WorkerThread();

        Thread t1 = new Thread(worker1);
        t1.start();

        new Thread(worker2).start();
        new Thread(worker3).start();
        new Thread(worker4).start();
        new Thread(worker5).start();
    }
}
