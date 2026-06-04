package gr.aueb.cf.ch16.threads;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 2_000_000_000; i++) {
            if ( i == 2_000_000_000) {
                System.out.println("Worker Thread: " + i);
            }
        }
    }
}
