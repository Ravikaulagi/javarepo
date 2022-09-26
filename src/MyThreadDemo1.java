class MyThreadOne extends Thread
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getId() + "Thread is Running ");
    }
}

public class MyThreadDemo1
{
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 10; i++) {
                MyThreadOne myThread=new MyThreadOne();
                myThread.start();
            }
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }
    }
}
