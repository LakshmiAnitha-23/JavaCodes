class MyThread extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("Thread using extends: "+i);
            try{Thread.sleep(500);
            }
            catch(InterruptedException e)
            {}
        }
    }
}

class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println("Thread using Runnable: " +i);
            try{Thread.sleep(500);}catch(InterruptedException e){}
        }
    }
}
public class ThreadsDemo
{
    public static void main(String[] args){
        MyThread t1=new MyThread();
        Thread t2=new Thread(new MyRunnable());

        t1.start();
        t2.start();

        System.out.println("Main thread is running..");
    }
}