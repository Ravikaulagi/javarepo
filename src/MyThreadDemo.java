class MyThread implements Runnable {
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getId() + "Thread is Running");
    }
}
public class MyThreadDemo {
    public static void main(String[] args) {
        try
        {
            for (int i = 0; i < 10; i++) {
                Thread myThread = new Thread(new MyThread());
                myThread.start();
            }
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }

    }
}


